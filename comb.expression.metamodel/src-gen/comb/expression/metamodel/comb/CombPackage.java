/**
 */
package comb.expression.metamodel.comb;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see comb.expression.metamodel.comb.CombFactory
 * @model kind="package"
 * @generated
 */
public interface CombPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "comb";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/comb";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "comb";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CombPackage eINSTANCE = comb.expression.metamodel.comb.impl.CombPackageImpl.init();

	/**
	 * The meta object id for the '{@link comb.expression.metamodel.comb.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comb.expression.metamodel.comb.impl.ElementImpl
	 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 71;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Subtree Interpretations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__SUBTREE_INTERPRETATIONS = 1;

	/**
	 * The feature id for the '<em><b>Logic Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__LOGIC_GROUP = 2;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link comb.expression.metamodel.comb.impl.LTLPatternMappingsImpl <em>LTL Pattern Mappings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comb.expression.metamodel.comb.impl.LTLPatternMappingsImpl
	 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getLTLPatternMappings()
	 * @generated
	 */
	int LTL_PATTERN_MAPPINGS = 93;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTL_PATTERN_MAPPINGS__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Subtree Interpretations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTL_PATTERN_MAPPINGS__SUBTREE_INTERPRETATIONS = ELEMENT__SUBTREE_INTERPRETATIONS;

	/**
	 * The feature id for the '<em><b>Logic Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTL_PATTERN_MAPPINGS__LOGIC_GROUP = ELEMENT__LOGIC_GROUP;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTL_PATTERN_MAPPINGS__P = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>LTL Pattern Mappings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTL_PATTERN_MAPPINGS_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>LTL Pattern Mappings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTL_PATTERN_MAPPINGS_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link comb.expression.metamodel.comb.impl.OrderImpl <em>Order</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comb.expression.metamodel.comb.impl.OrderImpl
	 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getOrder()
	 * @generated
	 */
	int ORDER = 29;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__NAME = LTL_PATTERN_MAPPINGS__NAME;

	/**
	 * The feature id for the '<em><b>Subtree Interpretations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__SUBTREE_INTERPRETATIONS = LTL_PATTERN_MAPPINGS__SUBTREE_INTERPRETATIONS;

	/**
	 * The feature id for the '<em><b>Logic Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__LOGIC_GROUP = LTL_PATTERN_MAPPINGS__LOGIC_GROUP;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__P = LTL_PATTERN_MAPPINGS__P;

	/**
	 * The feature id for the '<em><b>S</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__S = LTL_PATTERN_MAPPINGS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_FEATURE_COUNT = LTL_PATTERN_MAPPINGS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_OPERATION_COUNT = LTL_PATTERN_MAPPINGS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link comb.expression.metamodel.comb.impl.PrecedenceImpl <em>Precedence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comb.expression.metamodel.comb.impl.PrecedenceImpl
	 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getPrecedence()
	 * @generated
	 */
	int PRECEDENCE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE__NAME = ORDER__NAME;

	/**
	 * The feature id for the '<em><b>Subtree Interpretations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE__SUBTREE_INTERPRETATIONS = ORDER__SUBTREE_INTERPRETATIONS;

	/**
	 * The feature id for the '<em><b>Logic Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE__LOGIC_GROUP = ORDER__LOGIC_GROUP;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE__P = ORDER__P;

	/**
	 * The feature id for the '<em><b>S</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE__S = ORDER__S;

	/**
	 * The number of structural features of the '<em>Precedence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_FEATURE_COUNT = ORDER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Precedence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_OPERATION_COUNT = ORDER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link comb.expression.metamodel.comb.impl.PrecedenceTwoParamsImpl <em>Precedence Two Params</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comb.expression.metamodel.comb.impl.PrecedenceTwoParamsImpl
	 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getPrecedenceTwoParams()
	 * @generated
	 */
	int PRECEDENCE_TWO_PARAMS = 57;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_TWO_PARAMS__NAME = PRECEDENCE__NAME;

	/**
	 * The feature id for the '<em><b>Subtree Interpretations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_TWO_PARAMS__SUBTREE_INTERPRETATIONS = PRECEDENCE__SUBTREE_INTERPRETATIONS;

	/**
	 * The feature id for the '<em><b>Logic Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_TWO_PARAMS__LOGIC_GROUP = PRECEDENCE__LOGIC_GROUP;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_TWO_PARAMS__P = PRECEDENCE__P;

	/**
	 * The feature id for the '<em><b>S</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_TWO_PARAMS__S = PRECEDENCE__S;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_TWO_PARAMS__Q = PRECEDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>R</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_TWO_PARAMS__R = PRECEDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Precedence Two Params</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_TWO_PARAMS_FEATURE_COUNT = PRECEDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Precedence Two Params</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_TWO_PARAMS_OPERATION_COUNT = PRECEDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link comb.expression.metamodel.comb.impl.PrecedenceAfter_until_Impl <em>Precedence After until </em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comb.expression.metamodel.comb.impl.PrecedenceAfter_until_Impl
	 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getPrecedenceAfter_until_()
	 * @generated
	 */
	int PRECEDENCE_AFTER_UNTIL_ = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_AFTER_UNTIL___NAME = PRECEDENCE_TWO_PARAMS__NAME;

	/**
	 * The feature id for the '<em><b>Subtree Interpretations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_AFTER_UNTIL___SUBTREE_INTERPRETATIONS = PRECEDENCE_TWO_PARAMS__SUBTREE_INTERPRETATIONS;

	/**
	 * The feature id for the '<em><b>Logic Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_AFTER_UNTIL___LOGIC_GROUP = PRECEDENCE_TWO_PARAMS__LOGIC_GROUP;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_AFTER_UNTIL___P = PRECEDENCE_TWO_PARAMS__P;

	/**
	 * The feature id for the '<em><b>S</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_AFTER_UNTIL___S = PRECEDENCE_TWO_PARAMS__S;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_AFTER_UNTIL___Q = PRECEDENCE_TWO_PARAMS__Q;

	/**
	 * The feature id for the '<em><b>R</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_AFTER_UNTIL___R = PRECEDENCE_TWO_PARAMS__R;

	/**
	 * The feature id for the '<em><b>Interpretation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_AFTER_UNTIL___INTERPRETATION = PRECEDENCE_TWO_PARAMS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_AFTER_UNTIL___DESCRIPTION = PRECEDENCE_TWO_PARAMS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Precedence After until </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_AFTER_UNTIL__FEATURE_COUNT = PRECEDENCE_TWO_PARAMS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Precedence After until </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_AFTER_UNTIL__OPERATION_COUNT = PRECEDENCE_TWO_PARAMS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link comb.expression.metamodel.comb.impl.OccurrenceImpl <em>Occurrence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comb.expression.metamodel.comb.impl.OccurrenceImpl
	 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getOccurrence()
	 * @generated
	 */
	int OCCURRENCE = 63;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCURRENCE__NAME = LTL_PATTERN_MAPPINGS__NAME;

	/**
	 * The feature id for the '<em><b>Subtree Interpretations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCURRENCE__SUBTREE_INTERPRETATIONS = LTL_PATTERN_MAPPINGS__SUBTREE_INTERPRETATIONS;

	/**
	 * The feature id for the '<em><b>Logic Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCURRENCE__LOGIC_GROUP = LTL_PATTERN_MAPPINGS__LOGIC_GROUP;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCURRENCE__P = LTL_PATTERN_MAPPINGS__P;

	/**
	 * The number of structural features of the '<em>Occurrence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCURRENCE_FEATURE_COUNT = LTL_PATTERN_MAPPINGS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Occurrence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCURRENCE_OPERATION_COUNT = LTL_PATTERN_MAPPINGS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link comb.expression.metamodel.comb.impl.AbsenceImpl <em>Absence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comb.expression.metamodel.comb.impl.AbsenceImpl
	 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getAbsence()
	 * @generated
	 */
	int ABSENCE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSENCE__NAME = OCCURRENCE__NAME;

	/**
	 * The feature id for the '<em><b>Subtree Interpretations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSENCE__SUBTREE_INTERPRETATIONS = OCCURRENCE__SUBTREE_INTERPRETATIONS;

	/**
	 * The feature id for the '<em><b>Logic Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSENCE__LOGIC_GROUP = OCCURRENCE__LOGIC_GROUP;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSENCE__P = OCCURRENCE__P;

	/**
	 * The number of structural features of the '<em>Absence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSENCE_FEATURE_COUNT = OCCURRENCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Absence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSENCE_OPERATION_COUNT = OCCURRENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link comb.expression.metamodel.comb.impl.AbsenceTwoParamsImpl <em>Absence Two Params</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comb.expression.metamodel.comb.impl.AbsenceTwoParamsImpl
	 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getAbsenceTwoParams()
	 * @generated
	 */
	int ABSENCE_TWO_PARAMS = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSENCE_TWO_PARAMS__NAME = ABSENCE__NAME;

	/**
	 * The feature id for the '<em><b>Subtree Interpretations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSENCE_TWO_PARAMS__SUBTREE_INTERPRETATIONS = ABSENCE__SUBTREE_INTERPRETATIONS;

	/**
	 * The feature id for the '<em><b>Logic Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSENCE_TWO_PARAMS__LOGIC_GROUP = ABSENCE__LOGIC_GROUP;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSENCE_TWO_PARAMS__P = ABSENCE__P;

	/**
	 * The feature id for the '<em><b>R</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSENCE_TWO_PARAMS__R = ABSENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSENCE_TWO_PARAMS__Q = ABSENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Absence Two Params</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSENCE_TWO_PARAMS_FEATURE_COUNT = ABSENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Absence Two Params</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSENCE_TWO_PARAMS_OPERATION_COUNT = ABSENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link comb.expression.metamodel.comb.impl.AbsenceAfter_until_Impl <em>Absence After until </em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comb.expression.metamodel.comb.impl.AbsenceAfter_until_Impl
	 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getAbsenceAfter_until_()
	 * @generated
	 */
	int ABSENCE_AFTER_UNTIL_ = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSENCE_AFTER_UNTIL___NAME = ABSENCE_TWO_PARAMS__NAME;

	/**
	 * The feature id for the '<em><b>Subtree Interpretations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSENCE_AFTER_UNTIL___SUBTREE_INTERPRETATIONS = ABSENCE_TWO_PARAMS__SUBTREE_INTERPRETATIONS;

	/**
	 * The feature id for the '<em><b>Logic Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSENCE_AFTER_UNTIL___LOGIC_GROUP = ABSENCE_TWO_PARAMS__LOGIC_GROUP;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSENCE_AFTER_UNTIL___P = ABSENCE_TWO_PARAMS__P;

	/**
	 * The feature id for the '<em><b>R</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSENCE_AFTER_UNTIL___R = ABSENCE_TWO_PARAMS__R;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSENCE_AFTER_UNTIL___Q = ABSENCE_TWO_PARAMS__Q;

	/**
	 * The feature id for the '<em><b>Interpretation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSENCE_AFTER_UNTIL___INTERPRETATION = ABSENCE_TWO_PARAMS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSENCE_AFTER_UNTIL___DESCRIPTION = ABSENCE_TWO_PARAMS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Absence After until </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSENCE_AFTER_UNTIL__FEATURE_COUNT = ABSENCE_TWO_PARAMS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Absence After until </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSENCE_AFTER_UNTIL__OPERATION_COUNT = ABSENCE_TWO_PARAMS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link comb.expression.metamodel.comb.impl.LTLOperatorsImpl <em>LTL Operators</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comb.expression.metamodel.comb.impl.LTLOperatorsImpl
	 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getLTLOperators()
	 * @generated
	 */
	int LTL_OPERATORS = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTL_OPERATORS__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Subtree Interpretations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTL_OPERATORS__SUBTREE_INTERPRETATIONS = ELEMENT__SUBTREE_INTERPRETATIONS;

	/**
	 * The feature id for the '<em><b>Logic Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTL_OPERATORS__LOGIC_GROUP = ELEMENT__LOGIC_GROUP;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTL_OPERATORS__P = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>LTL Operators</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTL_OPERATORS_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>LTL Operators</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTL_OPERATORS_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link comb.expression.metamodel.comb.impl.LTLOperatorsTwoParamsImpl <em>LTL Operators Two Params</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comb.expression.metamodel.comb.impl.LTLOperatorsTwoParamsImpl
	 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getLTLOperatorsTwoParams()
	 * @generated
	 */
	int LTL_OPERATORS_TWO_PARAMS = 72;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTL_OPERATORS_TWO_PARAMS__NAME = LTL_OPERATORS__NAME;

	/**
	 * The feature id for the '<em><b>Subtree Interpretations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTL_OPERATORS_TWO_PARAMS__SUBTREE_INTERPRETATIONS = LTL_OPERATORS__SUBTREE_INTERPRETATIONS;

	/**
	 * The feature id for the '<em><b>Logic Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTL_OPERATORS_TWO_PARAMS__LOGIC_GROUP = LTL_OPERATORS__LOGIC_GROUP;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTL_OPERATORS_TWO_PARAMS__P = LTL_OPERATORS__P;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTL_OPERATORS_TWO_PARAMS__Q = LTL_OPERATORS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>LTL Operators Two Params</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTL_OPERATORS_TWO_PARAMS_FEATURE_COUNT = LTL_OPERATORS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>LTL Operators Two Params</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTL_OPERATORS_TWO_PARAMS_OPERATION_COUNT = LTL_OPERATORS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link comb.expression.metamodel.comb.impl._until_Impl <em>until </em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comb.expression.metamodel.comb.impl._until_Impl
	 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#get_until_()
	 * @generated
	 */
	int _UNTIL_ = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _UNTIL___NAME = LTL_OPERATORS_TWO_PARAMS__NAME;

	/**
	 * The feature id for the '<em><b>Subtree Interpretations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _UNTIL___SUBTREE_INTERPRETATIONS = LTL_OPERATORS_TWO_PARAMS__SUBTREE_INTERPRETATIONS;

	/**
	 * The feature id for the '<em><b>Logic Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _UNTIL___LOGIC_GROUP = LTL_OPERATORS_TWO_PARAMS__LOGIC_GROUP;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _UNTIL___P = LTL_OPERATORS_TWO_PARAMS__P;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _UNTIL___Q = LTL_OPERATORS_TWO_PARAMS__Q;

	/**
	 * The feature id for the '<em><b>Interpretation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _UNTIL___INTERPRETATION = LTL_OPERATORS_TWO_PARAMS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _UNTIL___DESCRIPTION = LTL_OPERATORS_TWO_PARAMS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>until </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _UNTIL__FEATURE_COUNT = LTL_OPERATORS_TWO_PARAMS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>until </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _UNTIL__OPERATION_COUNT = LTL_OPERATORS_TWO_PARAMS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link comb.expression.metamodel.comb.impl.PrecedenceWithoutParamsImpl <em>Precedence Without Params</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comb.expression.metamodel.comb.impl.PrecedenceWithoutParamsImpl
	 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getPrecedenceWithoutParams()
	 * @generated
	 */
	int PRECEDENCE_WITHOUT_PARAMS = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_WITHOUT_PARAMS__NAME = PRECEDENCE__NAME;

	/**
	 * The feature id for the '<em><b>Subtree Interpretations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_WITHOUT_PARAMS__SUBTREE_INTERPRETATIONS = PRECEDENCE__SUBTREE_INTERPRETATIONS;

	/**
	 * The feature id for the '<em><b>Logic Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_WITHOUT_PARAMS__LOGIC_GROUP = PRECEDENCE__LOGIC_GROUP;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_WITHOUT_PARAMS__P = PRECEDENCE__P;

	/**
	 * The feature id for the '<em><b>S</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_WITHOUT_PARAMS__S = PRECEDENCE__S;

	/**
	 * The number of structural features of the '<em>Precedence Without Params</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_WITHOUT_PARAMS_FEATURE_COUNT = PRECEDENCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Precedence Without Params</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_WITHOUT_PARAMS_OPERATION_COUNT = PRECEDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link comb.expression.metamodel.comb.impl.LTLOperatorsOneParamImpl <em>LTL Operators One Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comb.expression.metamodel.comb.impl.LTLOperatorsOneParamImpl
	 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getLTLOperatorsOneParam()
	 * @generated
	 */
	int LTL_OPERATORS_ONE_PARAM = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTL_OPERATORS_ONE_PARAM__NAME = LTL_OPERATORS__NAME;

	/**
	 * The feature id for the '<em><b>Subtree Interpretations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTL_OPERATORS_ONE_PARAM__SUBTREE_INTERPRETATIONS = LTL_OPERATORS__SUBTREE_INTERPRETATIONS;

	/**
	 * The feature id for the '<em><b>Logic Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTL_OPERATORS_ONE_PARAM__LOGIC_GROUP = LTL_OPERATORS__LOGIC_GROUP;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTL_OPERATORS_ONE_PARAM__P = LTL_OPERATORS__P;

	/**
	 * The number of structural features of the '<em>LTL Operators One Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTL_OPERATORS_ONE_PARAM_FEATURE_COUNT = LTL_OPERATORS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>LTL Operators One Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTL_OPERATORS_ONE_PARAM_OPERATION_COUNT = LTL_OPERATORS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link comb.expression.metamodel.comb.impl.UniversalityImpl <em>Universality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comb.expression.metamodel.comb.impl.UniversalityImpl
	 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getUniversality()
	 * @generated
	 */
	int UNIVERSALITY = 59;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSALITY__NAME = OCCURRENCE__NAME;

	/**
	 * The feature id for the '<em><b>Subtree Interpretations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSALITY__SUBTREE_INTERPRETATIONS = OCCURRENCE__SUBTREE_INTERPRETATIONS;

	/**
	 * The feature id for the '<em><b>Logic Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSALITY__LOGIC_GROUP = OCCURRENCE__LOGIC_GROUP;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSALITY__P = OCCURRENCE__P;

	/**
	 * The number of structural features of the '<em>Universality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSALITY_FEATURE_COUNT = OCCURRENCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Universality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSALITY_OPERATION_COUNT = OCCURRENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link comb.expression.metamodel.comb.impl.UniversalityOneParamImpl <em>Universality One Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comb.expression.metamodel.comb.impl.UniversalityOneParamImpl
	 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getUniversalityOneParam()
	 * @generated
	 */
	int UNIVERSALITY_ONE_PARAM = 65;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSALITY_ONE_PARAM__NAME = UNIVERSALITY__NAME;

	/**
	 * The feature id for the '<em><b>Subtree Interpretations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSALITY_ONE_PARAM__SUBTREE_INTERPRETATIONS = UNIVERSALITY__SUBTREE_INTERPRETATIONS;

	/**
	 * The feature id for the '<em><b>Logic Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSALITY_ONE_PARAM__LOGIC_GROUP = UNIVERSALITY__LOGIC_GROUP;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSALITY_ONE_PARAM__P = UNIVERSALITY__P;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSALITY_ONE_PARAM__Q = UNIVERSALITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Universality One Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSALITY_ONE_PARAM_FEATURE_COUNT = UNIVERSALITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Universality One Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSALITY_ONE_PARAM_OPERATION_COUNT = UNIVERSALITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link comb.expression.metamodel.comb.impl.UniversalityBefore_Impl <em>Universality Before </em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comb.expression.metamodel.comb.impl.UniversalityBefore_Impl
	 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getUniversalityBefore_()
	 * @generated
	 */
	int UNIVERSALITY_BEFORE_ = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSALITY_BEFORE___NAME = UNIVERSALITY_ONE_PARAM__NAME;

	/**
	 * The feature id for the '<em><b>Subtree Interpretations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSALITY_BEFORE___SUBTREE_INTERPRETATIONS = UNIVERSALITY_ONE_PARAM__SUBTREE_INTERPRETATIONS;

	/**
	 * The feature id for the '<em><b>Logic Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSALITY_BEFORE___LOGIC_GROUP = UNIVERSALITY_ONE_PARAM__LOGIC_GROUP;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSALITY_BEFORE___P = UNIVERSALITY_ONE_PARAM__P;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSALITY_BEFORE___Q = UNIVERSALITY_ONE_PARAM__Q;

	/**
	 * The feature id for the '<em><b>Interpretation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSALITY_BEFORE___INTERPRETATION = UNIVERSALITY_ONE_PARAM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSALITY_BEFORE___DESCRIPTION = UNIVERSALITY_ONE_PARAM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Universality Before </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSALITY_BEFORE__FEATURE_COUNT = UNIVERSALITY_ONE_PARAM_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Universality Before </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSALITY_BEFORE__OPERATION_COUNT = UNIVERSALITY_ONE_PARAM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link comb.expression.metamodel.comb.impl.PrecedenceOneParamImpl <em>Precedence One Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comb.expression.metamodel.comb.impl.PrecedenceOneParamImpl
	 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getPrecedenceOneParam()
	 * @generated
	 */
	int PRECEDENCE_ONE_PARAM = 60;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_ONE_PARAM__NAME = PRECEDENCE__NAME;

	/**
	 * The feature id for the '<em><b>Subtree Interpretations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_ONE_PARAM__SUBTREE_INTERPRETATIONS = PRECEDENCE__SUBTREE_INTERPRETATIONS;

	/**
	 * The feature id for the '<em><b>Logic Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_ONE_PARAM__LOGIC_GROUP = PRECEDENCE__LOGIC_GROUP;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_ONE_PARAM__P = PRECEDENCE__P;

	/**
	 * The feature id for the '<em><b>S</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_ONE_PARAM__S = PRECEDENCE__S;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_ONE_PARAM__Q = PRECEDENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Precedence One Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_ONE_PARAM_FEATURE_COUNT = PRECEDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Precedence One Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_ONE_PARAM_OPERATION_COUNT = PRECEDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link comb.expression.metamodel.comb.impl.PrecedenceBefore_Impl <em>Precedence Before </em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comb.expression.metamodel.comb.impl.PrecedenceBefore_Impl
	 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getPrecedenceBefore_()
	 * @generated
	 */
	int PRECEDENCE_BEFORE_ = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_BEFORE___NAME = PRECEDENCE_ONE_PARAM__NAME;

	/**
	 * The feature id for the '<em><b>Subtree Interpretations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_BEFORE___SUBTREE_INTERPRETATIONS = PRECEDENCE_ONE_PARAM__SUBTREE_INTERPRETATIONS;

	/**
	 * The feature id for the '<em><b>Logic Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_BEFORE___LOGIC_GROUP = PRECEDENCE_ONE_PARAM__LOGIC_GROUP;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_BEFORE___P = PRECEDENCE_ONE_PARAM__P;

	/**
	 * The feature id for the '<em><b>S</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_BEFORE___S = PRECEDENCE_ONE_PARAM__S;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_BEFORE___Q = PRECEDENCE_ONE_PARAM__Q;

	/**
	 * The feature id for the '<em><b>Interpretation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_BEFORE___INTERPRETATION = PRECEDENCE_ONE_PARAM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_BEFORE___DESCRIPTION = PRECEDENCE_ONE_PARAM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Precedence Before </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_BEFORE__FEATURE_COUNT = PRECEDENCE_ONE_PARAM_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Precedence Before </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_BEFORE__OPERATION_COUNT = PRECEDENCE_ONE_PARAM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link comb.expression.metamodel.comb.impl.UniversalityAfter_Impl <em>Universality After </em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comb.expression.metamodel.comb.impl.UniversalityAfter_Impl
	 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getUniversalityAfter_()
	 * @generated
	 */
	int UNIVERSALITY_AFTER_ = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSALITY_AFTER___NAME = UNIVERSALITY_ONE_PARAM__NAME;

	/**
	 * The feature id for the '<em><b>Subtree Interpretations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSALITY_AFTER___SUBTREE_INTERPRETATIONS = UNIVERSALITY_ONE_PARAM__SUBTREE_INTERPRETATIONS;

	/**
	 * The feature id for the '<em><b>Logic Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSALITY_AFTER___LOGIC_GROUP = UNIVERSALITY_ONE_PARAM__LOGIC_GROUP;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSALITY_AFTER___P = UNIVERSALITY_ONE_PARAM__P;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSALITY_AFTER___Q = UNIVERSALITY_ONE_PARAM__Q;

	/**
	 * The feature id for the '<em><b>Interpretation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSALITY_AFTER___INTERPRETATION = UNIVERSALITY_ONE_PARAM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSALITY_AFTER___DESCRIPTION = UNIVERSALITY_ONE_PARAM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Universality After </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSALITY_AFTER__FEATURE_COUNT = UNIVERSALITY_ONE_PARAM_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Universality After </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSALITY_AFTER__OPERATION_COUNT = UNIVERSALITY_ONE_PARAM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link comb.expression.metamodel.comb.impl.BoundedExistenceImpl <em>Bounded Existence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comb.expression.metamodel.comb.impl.BoundedExistenceImpl
	 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getBoundedExistence()
	 * @generated
	 */
	int BOUNDED_EXISTENCE = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_EXISTENCE__NAME = OCCURRENCE__NAME;

	/**
	 * The feature id for the '<em><b>Subtree Interpretations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_EXISTENCE__SUBTREE_INTERPRETATIONS = OCCURRENCE__SUBTREE_INTERPRETATIONS;

	/**
	 * The feature id for the '<em><b>Logic Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_EXISTENCE__LOGIC_GROUP = OCCURRENCE__LOGIC_GROUP;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_EXISTENCE__P = OCCURRENCE__P;

	/**
	 * The number of structural features of the '<em>Bounded Existence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_EXISTENCE_FEATURE_COUNT = OCCURRENCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Bounded Existence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_EXISTENCE_OPERATION_COUNT = OCCURRENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link comb.expression.metamodel.comb.impl.BoundedExistneceOneParamImpl <em>Bounded Existnece One Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comb.expression.metamodel.comb.impl.BoundedExistneceOneParamImpl
	 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getBoundedExistneceOneParam()
	 * @generated
	 */
	int BOUNDED_EXISTNECE_ONE_PARAM = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_EXISTNECE_ONE_PARAM__NAME = BOUNDED_EXISTENCE__NAME;

	/**
	 * The feature id for the '<em><b>Subtree Interpretations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_EXISTNECE_ONE_PARAM__SUBTREE_INTERPRETATIONS = BOUNDED_EXISTENCE__SUBTREE_INTERPRETATIONS;

	/**
	 * The feature id for the '<em><b>Logic Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_EXISTNECE_ONE_PARAM__LOGIC_GROUP = BOUNDED_EXISTENCE__LOGIC_GROUP;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_EXISTNECE_ONE_PARAM__P = BOUNDED_EXISTENCE__P;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_EXISTNECE_ONE_PARAM__Q = BOUNDED_EXISTENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bounded Existnece One Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_EXISTNECE_ONE_PARAM_FEATURE_COUNT = BOUNDED_EXISTENCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Bounded Existnece One Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_EXISTNECE_ONE_PARAM_OPERATION_COUNT = BOUNDED_EXISTENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link comb.expression.metamodel.comb.impl.BoundedExistenceAfter_Impl <em>Bounded Existence After </em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comb.expression.metamodel.comb.impl.BoundedExistenceAfter_Impl
	 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getBoundedExistenceAfter_()
	 * @generated
	 */
	int BOUNDED_EXISTENCE_AFTER_ = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_EXISTENCE_AFTER___NAME = BOUNDED_EXISTNECE_ONE_PARAM__NAME;

	/**
	 * The feature id for the '<em><b>Subtree Interpretations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_EXISTENCE_AFTER___SUBTREE_INTERPRETATIONS = BOUNDED_EXISTNECE_ONE_PARAM__SUBTREE_INTERPRETATIONS;

	/**
	 * The feature id for the '<em><b>Logic Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_EXISTENCE_AFTER___LOGIC_GROUP = BOUNDED_EXISTNECE_ONE_PARAM__LOGIC_GROUP;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_EXISTENCE_AFTER___P = BOUNDED_EXISTNECE_ONE_PARAM__P;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_EXISTENCE_AFTER___Q = BOUNDED_EXISTNECE_ONE_PARAM__Q;

	/**
	 * The feature id for the '<em><b>Interpretation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_EXISTENCE_AFTER___INTERPRETATION = BOUNDED_EXISTNECE_ONE_PARAM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_EXISTENCE_AFTER___DESCRIPTION = BOUNDED_EXISTNECE_ONE_PARAM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Bounded Existence After </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_EXISTENCE_AFTER__FEATURE_COUNT = BOUNDED_EXISTNECE_ONE_PARAM_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Bounded Existence After </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_EXISTENCE_AFTER__OPERATION_COUNT = BOUNDED_EXISTNECE_ONE_PARAM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link comb.expression.metamodel.comb.impl.BoundedExistenceTwoParamsImpl <em>Bounded Existence Two Params</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comb.expression.metamodel.comb.impl.BoundedExistenceTwoParamsImpl
	 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getBoundedExistenceTwoParams()
	 * @generated
	 */
	int BOUNDED_EXISTENCE_TWO_PARAMS = 69;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_EXISTENCE_TWO_PARAMS__NAME = BOUNDED_EXISTENCE__NAME;

	/**
	 * The feature id for the '<em><b>Subtree Interpretations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_EXISTENCE_TWO_PARAMS__SUBTREE_INTERPRETATIONS = BOUNDED_EXISTENCE__SUBTREE_INTERPRETATIONS;

	/**
	 * The feature id for the '<em><b>Logic Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_EXISTENCE_TWO_PARAMS__LOGIC_GROUP = BOUNDED_EXISTENCE__LOGIC_GROUP;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_EXISTENCE_TWO_PARAMS__P = BOUNDED_EXISTENCE__P;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_EXISTENCE_TWO_PARAMS__Q = BOUNDED_EXISTENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>R</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_EXISTENCE_TWO_PARAMS__R = BOUNDED_EXISTENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Bounded Existence Two Params</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_EXISTENCE_TWO_PARAMS_FEATURE_COUNT = BOUNDED_EXISTENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Bounded Existence Two Params</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_EXISTENCE_TWO_PARAMS_OPERATION_COUNT = BOUNDED_EXISTENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link comb.expression.metamodel.comb.impl.BoundedExistenceBetween_and_Impl <em>Bounded Existence Between and </em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comb.expression.metamodel.comb.impl.BoundedExistenceBetween_and_Impl
	 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getBoundedExistenceBetween_and_()
	 * @generated
	 */
	int BOUNDED_EXISTENCE_BETWEEN_AND_ = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_EXISTENCE_BETWEEN_AND___NAME = BOUNDED_EXISTENCE_TWO_PARAMS__NAME;

	/**
	 * The feature id for the '<em><b>Subtree Interpretations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_EXISTENCE_BETWEEN_AND___SUBTREE_INTERPRETATIONS = BOUNDED_EXISTENCE_TWO_PARAMS__SUBTREE_INTERPRETATIONS;

	/**
	 * The feature id for the '<em><b>Logic Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_EXISTENCE_BETWEEN_AND___LOGIC_GROUP = BOUNDED_EXISTENCE_TWO_PARAMS__LOGIC_GROUP;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_EXISTENCE_BETWEEN_AND___P = BOUNDED_EXISTENCE_TWO_PARAMS__P;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_EXISTENCE_BETWEEN_AND___Q = BOUNDED_EXISTENCE_TWO_PARAMS__Q;

	/**
	 * The feature id for the '<em><b>R</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_EXISTENCE_BETWEEN_AND___R = BOUNDED_EXISTENCE_TWO_PARAMS__R;

	/**
	 * The feature id for the '<em><b>Interpretation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_EXISTENCE_BETWEEN_AND___INTERPRETATION = BOUNDED_EXISTENCE_TWO_PARAMS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_EXISTENCE_BETWEEN_AND___DESCRIPTION = BOUNDED_EXISTENCE_TWO_PARAMS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Bounded Existence Between and </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_EXISTENCE_BETWEEN_AND__FEATURE_COUNT = BOUNDED_EXISTENCE_TWO_PARAMS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Bounded Existence Between and </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_EXISTENCE_BETWEEN_AND__OPERATION_COUNT = BOUNDED_EXISTENCE_TWO_PARAMS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link comb.expression.metamodel.comb.impl.BoundedExistenceWithoutParamsImpl <em>Bounded Existence Without Params</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comb.expression.metamodel.comb.impl.BoundedExistenceWithoutParamsImpl
	 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getBoundedExistenceWithoutParams()
	 * @generated
	 */
	int BOUNDED_EXISTENCE_WITHOUT_PARAMS = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_EXISTENCE_WITHOUT_PARAMS__NAME = BOUNDED_EXISTENCE__NAME;

	/**
	 * The feature id for the '<em><b>Subtree Interpretations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_EXISTENCE_WITHOUT_PARAMS__SUBTREE_INTERPRETATIONS = BOUNDED_EXISTENCE__SUBTREE_INTERPRETATIONS;

	/**
	 * The feature id for the '<em><b>Logic Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_EXISTENCE_WITHOUT_PARAMS__LOGIC_GROUP = BOUNDED_EXISTENCE__LOGIC_GROUP;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_EXISTENCE_WITHOUT_PARAMS__P = BOUNDED_EXISTENCE__P;

	/**
	 * The number of structural features of the '<em>Bounded Existence Without Params</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_EXISTENCE_WITHOUT_PARAMS_FEATURE_COUNT = BOUNDED_EXISTENCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Bounded Existence Without Params</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_EXISTENCE_WITHOUT_PARAMS_OPERATION_COUNT = BOUNDED_EXISTENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link comb.expression.metamodel.comb.impl.BoundedExistenceGlobally_Impl <em>Bounded Existence Globally </em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comb.expression.metamodel.comb.impl.BoundedExistenceGlobally_Impl
	 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getBoundedExistenceGlobally_()
	 * @generated
	 */
	int BOUNDED_EXISTENCE_GLOBALLY_ = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_EXISTENCE_GLOBALLY___NAME = BOUNDED_EXISTENCE_WITHOUT_PARAMS__NAME;

	/**
	 * The feature id for the '<em><b>Subtree Interpretations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_EXISTENCE_GLOBALLY___SUBTREE_INTERPRETATIONS = BOUNDED_EXISTENCE_WITHOUT_PARAMS__SUBTREE_INTERPRETATIONS;

	/**
	 * The feature id for the '<em><b>Logic Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_EXISTENCE_GLOBALLY___LOGIC_GROUP = BOUNDED_EXISTENCE_WITHOUT_PARAMS__LOGIC_GROUP;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_EXISTENCE_GLOBALLY___P = BOUNDED_EXISTENCE_WITHOUT_PARAMS__P;

	/**
	 * The feature id for the '<em><b>Interpretation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_EXISTENCE_GLOBALLY___INTERPRETATION = BOUNDED_EXISTENCE_WITHOUT_PARAMS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_EXISTENCE_GLOBALLY___DESCRIPTION = BOUNDED_EXISTENCE_WITHOUT_PARAMS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Bounded Existence Globally </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_EXISTENCE_GLOBALLY__FEATURE_COUNT = BOUNDED_EXISTENCE_WITHOUT_PARAMS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Bounded Existence Globally </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_EXISTENCE_GLOBALLY__OPERATION_COUNT = BOUNDED_EXISTENCE_WITHOUT_PARAMS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link comb.expression.metamodel.comb.impl.AbsenceOneParamImpl <em>Absence One Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comb.expression.metamodel.comb.impl.AbsenceOneParamImpl
	 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getAbsenceOneParam()
	 * @generated
	 */
	int ABSENCE_ONE_PARAM = 42;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSENCE_ONE_PARAM__NAME = ABSENCE__NAME;

	/**
	 * The feature id for the '<em><b>Subtree Interpretations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSENCE_ONE_PARAM__SUBTREE_INTERPRETATIONS = ABSENCE__SUBTREE_INTERPRETATIONS;

	/**
	 * The feature id for the '<em><b>Logic Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSENCE_ONE_PARAM__LOGIC_GROUP = ABSENCE__LOGIC_GROUP;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSENCE_ONE_PARAM__P = ABSENCE__P;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSENCE_ONE_PARAM__Q = ABSENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Absence One Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSENCE_ONE_PARAM_FEATURE_COUNT = ABSENCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Absence One Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSENCE_ONE_PARAM_OPERATION_COUNT = ABSENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link comb.expression.metamodel.comb.impl.AbsenceBefore_Impl <em>Absence Before </em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comb.expression.metamodel.comb.impl.AbsenceBefore_Impl
	 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getAbsenceBefore_()
	 * @generated
	 */
	int ABSENCE_BEFORE_ = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSENCE_BEFORE___NAME = ABSENCE_ONE_PARAM__NAME;

	/**
	 * The feature id for the '<em><b>Subtree Interpretations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSENCE_BEFORE___SUBTREE_INTERPRETATIONS = ABSENCE_ONE_PARAM__SUBTREE_INTERPRETATIONS;

	/**
	 * The feature id for the '<em><b>Logic Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSENCE_BEFORE___LOGIC_GROUP = ABSENCE_ONE_PARAM__LOGIC_GROUP;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSENCE_BEFORE___P = ABSENCE_ONE_PARAM__P;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSENCE_BEFORE___Q = ABSENCE_ONE_PARAM__Q;

	/**
	 * The feature id for the '<em><b>Interpretation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSENCE_BEFORE___INTERPRETATION = ABSENCE_ONE_PARAM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSENCE_BEFORE___DESCRIPTION = ABSENCE_ONE_PARAM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Absence Before </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSENCE_BEFORE__FEATURE_COUNT = ABSENCE_ONE_PARAM_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Absence Before </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSENCE_BEFORE__OPERATION_COUNT = ABSENCE_ONE_PARAM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link comb.expression.metamodel.comb.impl.UniversalityTwoParamsImpl <em>Universality Two Params</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comb.expression.metamodel.comb.impl.UniversalityTwoParamsImpl
	 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getUniversalityTwoParams()
	 * @generated
	 */
	int UNIVERSALITY_TWO_PARAMS = 33;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSALITY_TWO_PARAMS__NAME = UNIVERSALITY__NAME;

	/**
	 * The feature id for the '<em><b>Subtree Interpretations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSALITY_TWO_PARAMS__SUBTREE_INTERPRETATIONS = UNIVERSALITY__SUBTREE_INTERPRETATIONS;

	/**
	 * The feature id for the '<em><b>Logic Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSALITY_TWO_PARAMS__LOGIC_GROUP = UNIVERSALITY__LOGIC_GROUP;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSALITY_TWO_PARAMS__P = UNIVERSALITY__P;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSALITY_TWO_PARAMS__Q = UNIVERSALITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>R</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSALITY_TWO_PARAMS__R = UNIVERSALITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Universality Two Params</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSALITY_TWO_PARAMS_FEATURE_COUNT = UNIVERSALITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Universality Two Params</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSALITY_TWO_PARAMS_OPERATION_COUNT = UNIVERSALITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link comb.expression.metamodel.comb.impl.UniversalityBetween_and_Impl <em>Universality Between and </em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comb.expression.metamodel.comb.impl.UniversalityBetween_and_Impl
	 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getUniversalityBetween_and_()
	 * @generated
	 */
	int UNIVERSALITY_BETWEEN_AND_ = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSALITY_BETWEEN_AND___NAME = UNIVERSALITY_TWO_PARAMS__NAME;

	/**
	 * The feature id for the '<em><b>Subtree Interpretations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSALITY_BETWEEN_AND___SUBTREE_INTERPRETATIONS = UNIVERSALITY_TWO_PARAMS__SUBTREE_INTERPRETATIONS;

	/**
	 * The feature id for the '<em><b>Logic Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSALITY_BETWEEN_AND___LOGIC_GROUP = UNIVERSALITY_TWO_PARAMS__LOGIC_GROUP;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSALITY_BETWEEN_AND___P = UNIVERSALITY_TWO_PARAMS__P;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSALITY_BETWEEN_AND___Q = UNIVERSALITY_TWO_PARAMS__Q;

	/**
	 * The feature id for the '<em><b>R</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSALITY_BETWEEN_AND___R = UNIVERSALITY_TWO_PARAMS__R;

	/**
	 * The feature id for the '<em><b>Interpretation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSALITY_BETWEEN_AND___INTERPRETATION = UNIVERSALITY_TWO_PARAMS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSALITY_BETWEEN_AND___DESCRIPTION = UNIVERSALITY_TWO_PARAMS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Universality Between and </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSALITY_BETWEEN_AND__FEATURE_COUNT = UNIVERSALITY_TWO_PARAMS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Universality Between and </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSALITY_BETWEEN_AND__OPERATION_COUNT = UNIVERSALITY_TWO_PARAMS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link comb.expression.metamodel.comb.impl.ExistenceImpl <em>Existence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comb.expression.metamodel.comb.impl.ExistenceImpl
	 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getExistence()
	 * @generated
	 */
	int EXISTENCE = 49;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENCE__NAME = OCCURRENCE__NAME;

	/**
	 * The feature id for the '<em><b>Subtree Interpretations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENCE__SUBTREE_INTERPRETATIONS = OCCURRENCE__SUBTREE_INTERPRETATIONS;

	/**
	 * The feature id for the '<em><b>Logic Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENCE__LOGIC_GROUP = OCCURRENCE__LOGIC_GROUP;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENCE__P = OCCURRENCE__P;

	/**
	 * The number of structural features of the '<em>Existence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENCE_FEATURE_COUNT = OCCURRENCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Existence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENCE_OPERATION_COUNT = OCCURRENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link comb.expression.metamodel.comb.impl.ExistenceWithourParamsImpl <em>Existence Withour Params</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comb.expression.metamodel.comb.impl.ExistenceWithourParamsImpl
	 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getExistenceWithourParams()
	 * @generated
	 */
	int EXISTENCE_WITHOUR_PARAMS = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENCE_WITHOUR_PARAMS__NAME = EXISTENCE__NAME;

	/**
	 * The feature id for the '<em><b>Subtree Interpretations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENCE_WITHOUR_PARAMS__SUBTREE_INTERPRETATIONS = EXISTENCE__SUBTREE_INTERPRETATIONS;

	/**
	 * The feature id for the '<em><b>Logic Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENCE_WITHOUR_PARAMS__LOGIC_GROUP = EXISTENCE__LOGIC_GROUP;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENCE_WITHOUR_PARAMS__P = EXISTENCE__P;

	/**
	 * The number of structural features of the '<em>Existence Withour Params</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENCE_WITHOUR_PARAMS_FEATURE_COUNT = EXISTENCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Existence Withour Params</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENCE_WITHOUR_PARAMS_OPERATION_COUNT = EXISTENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link comb.expression.metamodel.comb.impl.ResponseImpl <em>Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comb.expression.metamodel.comb.impl.ResponseImpl
	 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getResponse()
	 * @generated
	 */
	int RESPONSE = 39;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE__NAME = ORDER__NAME;

	/**
	 * The feature id for the '<em><b>Subtree Interpretations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE__SUBTREE_INTERPRETATIONS = ORDER__SUBTREE_INTERPRETATIONS;

	/**
	 * The feature id for the '<em><b>Logic Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE__LOGIC_GROUP = ORDER__LOGIC_GROUP;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE__P = ORDER__P;

	/**
	 * The feature id for the '<em><b>S</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE__S = ORDER__S;

	/**
	 * The number of structural features of the '<em>Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_FEATURE_COUNT = ORDER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_OPERATION_COUNT = ORDER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link comb.expression.metamodel.comb.impl.ResponseTwoParamsImpl <em>Response Two Params</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comb.expression.metamodel.comb.impl.ResponseTwoParamsImpl
	 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getResponseTwoParams()
	 * @generated
	 */
	int RESPONSE_TWO_PARAMS = 61;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_TWO_PARAMS__NAME = RESPONSE__NAME;

	/**
	 * The feature id for the '<em><b>Subtree Interpretations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_TWO_PARAMS__SUBTREE_INTERPRETATIONS = RESPONSE__SUBTREE_INTERPRETATIONS;

	/**
	 * The feature id for the '<em><b>Logic Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_TWO_PARAMS__LOGIC_GROUP = RESPONSE__LOGIC_GROUP;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_TWO_PARAMS__P = RESPONSE__P;

	/**
	 * The feature id for the '<em><b>S</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_TWO_PARAMS__S = RESPONSE__S;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_TWO_PARAMS__Q = RESPONSE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>R</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_TWO_PARAMS__R = RESPONSE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Response Two Params</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_TWO_PARAMS_FEATURE_COUNT = RESPONSE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Response Two Params</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_TWO_PARAMS_OPERATION_COUNT = RESPONSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link comb.expression.metamodel.comb.impl.ResponseAfter_until_Impl <em>Response After until </em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comb.expression.metamodel.comb.impl.ResponseAfter_until_Impl
	 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getResponseAfter_until_()
	 * @generated
	 */
	int RESPONSE_AFTER_UNTIL_ = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_AFTER_UNTIL___NAME = RESPONSE_TWO_PARAMS__NAME;

	/**
	 * The feature id for the '<em><b>Subtree Interpretations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_AFTER_UNTIL___SUBTREE_INTERPRETATIONS = RESPONSE_TWO_PARAMS__SUBTREE_INTERPRETATIONS;

	/**
	 * The feature id for the '<em><b>Logic Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_AFTER_UNTIL___LOGIC_GROUP = RESPONSE_TWO_PARAMS__LOGIC_GROUP;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_AFTER_UNTIL___P = RESPONSE_TWO_PARAMS__P;

	/**
	 * The feature id for the '<em><b>S</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_AFTER_UNTIL___S = RESPONSE_TWO_PARAMS__S;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_AFTER_UNTIL___Q = RESPONSE_TWO_PARAMS__Q;

	/**
	 * The feature id for the '<em><b>R</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_AFTER_UNTIL___R = RESPONSE_TWO_PARAMS__R;

	/**
	 * The feature id for the '<em><b>Interpretation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_AFTER_UNTIL___INTERPRETATION = RESPONSE_TWO_PARAMS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_AFTER_UNTIL___DESCRIPTION = RESPONSE_TWO_PARAMS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Response After until </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_AFTER_UNTIL__FEATURE_COUNT = RESPONSE_TWO_PARAMS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Response After until </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_AFTER_UNTIL__OPERATION_COUNT = RESPONSE_TWO_PARAMS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link comb.expression.metamodel.comb.impl.BooleanOperatorsImpl <em>Boolean Operators</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comb.expression.metamodel.comb.impl.BooleanOperatorsImpl
	 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getBooleanOperators()
	 * @generated
	 */
	int BOOLEAN_OPERATORS = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATORS__NAME = LTL_OPERATORS__NAME;

	/**
	 * The feature id for the '<em><b>Subtree Interpretations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATORS__SUBTREE_INTERPRETATIONS = LTL_OPERATORS__SUBTREE_INTERPRETATIONS;

	/**
	 * The feature id for the '<em><b>Logic Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATORS__LOGIC_GROUP = LTL_OPERATORS__LOGIC_GROUP;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATORS__P = LTL_OPERATORS__P;

	/**
	 * The number of structural features of the '<em>Boolean Operators</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATORS_FEATURE_COUNT = LTL_OPERATORS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Boolean Operators</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATORS_OPERATION_COUNT = LTL_OPERATORS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link comb.expression.metamodel.comb.impl.PrecedenceAfter_Impl <em>Precedence After </em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comb.expression.metamodel.comb.impl.PrecedenceAfter_Impl
	 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getPrecedenceAfter_()
	 * @generated
	 */
	int PRECEDENCE_AFTER_ = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_AFTER___NAME = PRECEDENCE_ONE_PARAM__NAME;

	/**
	 * The feature id for the '<em><b>Subtree Interpretations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_AFTER___SUBTREE_INTERPRETATIONS = PRECEDENCE_ONE_PARAM__SUBTREE_INTERPRETATIONS;

	/**
	 * The feature id for the '<em><b>Logic Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_AFTER___LOGIC_GROUP = PRECEDENCE_ONE_PARAM__LOGIC_GROUP;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_AFTER___P = PRECEDENCE_ONE_PARAM__P;

	/**
	 * The feature id for the '<em><b>S</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_AFTER___S = PRECEDENCE_ONE_PARAM__S;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_AFTER___Q = PRECEDENCE_ONE_PARAM__Q;

	/**
	 * The feature id for the '<em><b>Interpretation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_AFTER___INTERPRETATION = PRECEDENCE_ONE_PARAM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_AFTER___DESCRIPTION = PRECEDENCE_ONE_PARAM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Precedence After </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_AFTER__FEATURE_COUNT = PRECEDENCE_ONE_PARAM_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Precedence After </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_AFTER__OPERATION_COUNT = PRECEDENCE_ONE_PARAM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link comb.expression.metamodel.comb.impl.Always_Impl <em>Always </em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comb.expression.metamodel.comb.impl.Always_Impl
	 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getAlways_()
	 * @generated
	 */
	int ALWAYS_ = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALWAYS___NAME = LTL_OPERATORS_ONE_PARAM__NAME;

	/**
	 * The feature id for the '<em><b>Subtree Interpretations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALWAYS___SUBTREE_INTERPRETATIONS = LTL_OPERATORS_ONE_PARAM__SUBTREE_INTERPRETATIONS;

	/**
	 * The feature id for the '<em><b>Logic Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALWAYS___LOGIC_GROUP = LTL_OPERATORS_ONE_PARAM__LOGIC_GROUP;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALWAYS___P = LTL_OPERATORS_ONE_PARAM__P;

	/**
	 * The feature id for the '<em><b>Interpretation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALWAYS___INTERPRETATION = LTL_OPERATORS_ONE_PARAM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALWAYS___DESCRIPTION = LTL_OPERATORS_ONE_PARAM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Always </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALWAYS__FEATURE_COUNT = LTL_OPERATORS_ONE_PARAM_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Always </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALWAYS__OPERATION_COUNT = LTL_OPERATORS_ONE_PARAM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link comb.expression.metamodel.comb.impl.AbsenceWithoutParamsImpl <em>Absence Without Params</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comb.expression.metamodel.comb.impl.AbsenceWithoutParamsImpl
	 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getAbsenceWithoutParams()
	 * @generated
	 */
	int ABSENCE_WITHOUT_PARAMS = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSENCE_WITHOUT_PARAMS__NAME = ABSENCE__NAME;

	/**
	 * The feature id for the '<em><b>Subtree Interpretations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSENCE_WITHOUT_PARAMS__SUBTREE_INTERPRETATIONS = ABSENCE__SUBTREE_INTERPRETATIONS;

	/**
	 * The feature id for the '<em><b>Logic Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSENCE_WITHOUT_PARAMS__LOGIC_GROUP = ABSENCE__LOGIC_GROUP;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSENCE_WITHOUT_PARAMS__P = ABSENCE__P;

	/**
	 * The number of structural features of the '<em>Absence Without Params</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSENCE_WITHOUT_PARAMS_FEATURE_COUNT = ABSENCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Absence Without Params</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSENCE_WITHOUT_PARAMS_OPERATION_COUNT = ABSENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link comb.expression.metamodel.comb.impl.ResponseBetween_and_Impl <em>Response Between and </em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comb.expression.metamodel.comb.impl.ResponseBetween_and_Impl
	 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getResponseBetween_and_()
	 * @generated
	 */
	int RESPONSE_BETWEEN_AND_ = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_BETWEEN_AND___NAME = RESPONSE_TWO_PARAMS__NAME;

	/**
	 * The feature id for the '<em><b>Subtree Interpretations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_BETWEEN_AND___SUBTREE_INTERPRETATIONS = RESPONSE_TWO_PARAMS__SUBTREE_INTERPRETATIONS;

	/**
	 * The feature id for the '<em><b>Logic Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_BETWEEN_AND___LOGIC_GROUP = RESPONSE_TWO_PARAMS__LOGIC_GROUP;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_BETWEEN_AND___P = RESPONSE_TWO_PARAMS__P;

	/**
	 * The feature id for the '<em><b>S</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_BETWEEN_AND___S = RESPONSE_TWO_PARAMS__S;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_BETWEEN_AND___Q = RESPONSE_TWO_PARAMS__Q;

	/**
	 * The feature id for the '<em><b>R</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_BETWEEN_AND___R = RESPONSE_TWO_PARAMS__R;

	/**
	 * The feature id for the '<em><b>Interpretation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_BETWEEN_AND___INTERPRETATION = RESPONSE_TWO_PARAMS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_BETWEEN_AND___DESCRIPTION = RESPONSE_TWO_PARAMS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Response Between and </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_BETWEEN_AND__FEATURE_COUNT = RESPONSE_TWO_PARAMS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Response Between and </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_BETWEEN_AND__OPERATION_COUNT = RESPONSE_TWO_PARAMS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link comb.expression.metamodel.comb.impl.ResponseOneParamImpl <em>Response One Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comb.expression.metamodel.comb.impl.ResponseOneParamImpl
	 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getResponseOneParam()
	 * @generated
	 */
	int RESPONSE_ONE_PARAM = 64;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_ONE_PARAM__NAME = RESPONSE__NAME;

	/**
	 * The feature id for the '<em><b>Subtree Interpretations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_ONE_PARAM__SUBTREE_INTERPRETATIONS = RESPONSE__SUBTREE_INTERPRETATIONS;

	/**
	 * The feature id for the '<em><b>Logic Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_ONE_PARAM__LOGIC_GROUP = RESPONSE__LOGIC_GROUP;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_ONE_PARAM__P = RESPONSE__P;

	/**
	 * The feature id for the '<em><b>S</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_ONE_PARAM__S = RESPONSE__S;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_ONE_PARAM__Q = RESPONSE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Response One Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_ONE_PARAM_FEATURE_COUNT = RESPONSE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Response One Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_ONE_PARAM_OPERATION_COUNT = RESPONSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link comb.expression.metamodel.comb.impl.ResponseAfter_Impl <em>Response After </em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comb.expression.metamodel.comb.impl.ResponseAfter_Impl
	 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getResponseAfter_()
	 * @generated
	 */
	int RESPONSE_AFTER_ = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_AFTER___NAME = RESPONSE_ONE_PARAM__NAME;

	/**
	 * The feature id for the '<em><b>Subtree Interpretations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_AFTER___SUBTREE_INTERPRETATIONS = RESPONSE_ONE_PARAM__SUBTREE_INTERPRETATIONS;

	/**
	 * The feature id for the '<em><b>Logic Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_AFTER___LOGIC_GROUP = RESPONSE_ONE_PARAM__LOGIC_GROUP;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_AFTER___P = RESPONSE_ONE_PARAM__P;

	/**
	 * The feature id for the '<em><b>S</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_AFTER___S = RESPONSE_ONE_PARAM__S;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_AFTER___Q = RESPONSE_ONE_PARAM__Q;

	/**
	 * The feature id for the '<em><b>Interpretation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_AFTER___INTERPRETATION = RESPONSE_ONE_PARAM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_AFTER___DESCRIPTION = RESPONSE_ONE_PARAM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Response After </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_AFTER__FEATURE_COUNT = RESPONSE_ONE_PARAM_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Response After </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_AFTER__OPERATION_COUNT = RESPONSE_ONE_PARAM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link comb.expression.metamodel.comb.impl.PrecedenceBetween_and_Impl <em>Precedence Between and </em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comb.expression.metamodel.comb.impl.PrecedenceBetween_and_Impl
	 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getPrecedenceBetween_and_()
	 * @generated
	 */
	int PRECEDENCE_BETWEEN_AND_ = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_BETWEEN_AND___NAME = PRECEDENCE_TWO_PARAMS__NAME;

	/**
	 * The feature id for the '<em><b>Subtree Interpretations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_BETWEEN_AND___SUBTREE_INTERPRETATIONS = PRECEDENCE_TWO_PARAMS__SUBTREE_INTERPRETATIONS;

	/**
	 * The feature id for the '<em><b>Logic Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_BETWEEN_AND___LOGIC_GROUP = PRECEDENCE_TWO_PARAMS__LOGIC_GROUP;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_BETWEEN_AND___P = PRECEDENCE_TWO_PARAMS__P;

	/**
	 * The feature id for the '<em><b>S</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_BETWEEN_AND___S = PRECEDENCE_TWO_PARAMS__S;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_BETWEEN_AND___Q = PRECEDENCE_TWO_PARAMS__Q;

	/**
	 * The feature id for the '<em><b>R</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_BETWEEN_AND___R = PRECEDENCE_TWO_PARAMS__R;

	/**
	 * The feature id for the '<em><b>Interpretation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_BETWEEN_AND___INTERPRETATION = PRECEDENCE_TWO_PARAMS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_BETWEEN_AND___DESCRIPTION = PRECEDENCE_TWO_PARAMS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Precedence Between and </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_BETWEEN_AND__FEATURE_COUNT = PRECEDENCE_TWO_PARAMS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Precedence Between and </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_BETWEEN_AND__OPERATION_COUNT = PRECEDENCE_TWO_PARAMS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link comb.expression.metamodel.comb.impl.ExistenceTwoParamsImpl <em>Existence Two Params</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comb.expression.metamodel.comb.impl.ExistenceTwoParamsImpl
	 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getExistenceTwoParams()
	 * @generated
	 */
	int EXISTENCE_TWO_PARAMS = 48;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENCE_TWO_PARAMS__NAME = EXISTENCE__NAME;

	/**
	 * The feature id for the '<em><b>Subtree Interpretations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENCE_TWO_PARAMS__SUBTREE_INTERPRETATIONS = EXISTENCE__SUBTREE_INTERPRETATIONS;

	/**
	 * The feature id for the '<em><b>Logic Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENCE_TWO_PARAMS__LOGIC_GROUP = EXISTENCE__LOGIC_GROUP;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENCE_TWO_PARAMS__P = EXISTENCE__P;

	/**
	 * The feature id for the '<em><b>R</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENCE_TWO_PARAMS__R = EXISTENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENCE_TWO_PARAMS__Q = EXISTENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Existence Two Params</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENCE_TWO_PARAMS_FEATURE_COUNT = EXISTENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Existence Two Params</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENCE_TWO_PARAMS_OPERATION_COUNT = EXISTENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link comb.expression.metamodel.comb.impl.ExistenceBetween_and_Impl <em>Existence Between and </em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comb.expression.metamodel.comb.impl.ExistenceBetween_and_Impl
	 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getExistenceBetween_and_()
	 * @generated
	 */
	int EXISTENCE_BETWEEN_AND_ = 30;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENCE_BETWEEN_AND___NAME = EXISTENCE_TWO_PARAMS__NAME;

	/**
	 * The feature id for the '<em><b>Subtree Interpretations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENCE_BETWEEN_AND___SUBTREE_INTERPRETATIONS = EXISTENCE_TWO_PARAMS__SUBTREE_INTERPRETATIONS;

	/**
	 * The feature id for the '<em><b>Logic Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENCE_BETWEEN_AND___LOGIC_GROUP = EXISTENCE_TWO_PARAMS__LOGIC_GROUP;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENCE_BETWEEN_AND___P = EXISTENCE_TWO_PARAMS__P;

	/**
	 * The feature id for the '<em><b>R</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENCE_BETWEEN_AND___R = EXISTENCE_TWO_PARAMS__R;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENCE_BETWEEN_AND___Q = EXISTENCE_TWO_PARAMS__Q;

	/**
	 * The feature id for the '<em><b>Interpretation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENCE_BETWEEN_AND___INTERPRETATION = EXISTENCE_TWO_PARAMS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENCE_BETWEEN_AND___DESCRIPTION = EXISTENCE_TWO_PARAMS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Existence Between and </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENCE_BETWEEN_AND__FEATURE_COUNT = EXISTENCE_TWO_PARAMS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Existence Between and </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENCE_BETWEEN_AND__OPERATION_COUNT = EXISTENCE_TWO_PARAMS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link comb.expression.metamodel.comb.impl.ExistenceAfter_until_Impl <em>Existence After until </em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comb.expression.metamodel.comb.impl.ExistenceAfter_until_Impl
	 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getExistenceAfter_until_()
	 * @generated
	 */
	int EXISTENCE_AFTER_UNTIL_ = 31;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENCE_AFTER_UNTIL___NAME = EXISTENCE_TWO_PARAMS__NAME;

	/**
	 * The feature id for the '<em><b>Subtree Interpretations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENCE_AFTER_UNTIL___SUBTREE_INTERPRETATIONS = EXISTENCE_TWO_PARAMS__SUBTREE_INTERPRETATIONS;

	/**
	 * The feature id for the '<em><b>Logic Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENCE_AFTER_UNTIL___LOGIC_GROUP = EXISTENCE_TWO_PARAMS__LOGIC_GROUP;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENCE_AFTER_UNTIL___P = EXISTENCE_TWO_PARAMS__P;

	/**
	 * The feature id for the '<em><b>R</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENCE_AFTER_UNTIL___R = EXISTENCE_TWO_PARAMS__R;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENCE_AFTER_UNTIL___Q = EXISTENCE_TWO_PARAMS__Q;

	/**
	 * The feature id for the '<em><b>Interpretation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENCE_AFTER_UNTIL___INTERPRETATION = EXISTENCE_TWO_PARAMS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENCE_AFTER_UNTIL___DESCRIPTION = EXISTENCE_TWO_PARAMS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Existence After until </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENCE_AFTER_UNTIL__FEATURE_COUNT = EXISTENCE_TWO_PARAMS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Existence After until </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENCE_AFTER_UNTIL__OPERATION_COUNT = EXISTENCE_TWO_PARAMS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link comb.expression.metamodel.comb.impl.ResponseBefore_Impl <em>Response Before </em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comb.expression.metamodel.comb.impl.ResponseBefore_Impl
	 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getResponseBefore_()
	 * @generated
	 */
	int RESPONSE_BEFORE_ = 32;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_BEFORE___NAME = RESPONSE_ONE_PARAM__NAME;

	/**
	 * The feature id for the '<em><b>Subtree Interpretations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_BEFORE___SUBTREE_INTERPRETATIONS = RESPONSE_ONE_PARAM__SUBTREE_INTERPRETATIONS;

	/**
	 * The feature id for the '<em><b>Logic Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_BEFORE___LOGIC_GROUP = RESPONSE_ONE_PARAM__LOGIC_GROUP;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_BEFORE___P = RESPONSE_ONE_PARAM__P;

	/**
	 * The feature id for the '<em><b>S</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_BEFORE___S = RESPONSE_ONE_PARAM__S;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_BEFORE___Q = RESPONSE_ONE_PARAM__Q;

	/**
	 * The feature id for the '<em><b>Interpretation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_BEFORE___INTERPRETATION = RESPONSE_ONE_PARAM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_BEFORE___DESCRIPTION = RESPONSE_ONE_PARAM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Response Before </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_BEFORE__FEATURE_COUNT = RESPONSE_ONE_PARAM_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Response Before </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_BEFORE__OPERATION_COUNT = RESPONSE_ONE_PARAM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link comb.expression.metamodel.comb.impl.BooleanOperatorsTwoParamsImpl <em>Boolean Operators Two Params</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comb.expression.metamodel.comb.impl.BooleanOperatorsTwoParamsImpl
	 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getBooleanOperatorsTwoParams()
	 * @generated
	 */
	int BOOLEAN_OPERATORS_TWO_PARAMS = 46;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATORS_TWO_PARAMS__NAME = BOOLEAN_OPERATORS__NAME;

	/**
	 * The feature id for the '<em><b>Subtree Interpretations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATORS_TWO_PARAMS__SUBTREE_INTERPRETATIONS = BOOLEAN_OPERATORS__SUBTREE_INTERPRETATIONS;

	/**
	 * The feature id for the '<em><b>Logic Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATORS_TWO_PARAMS__LOGIC_GROUP = BOOLEAN_OPERATORS__LOGIC_GROUP;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATORS_TWO_PARAMS__P = BOOLEAN_OPERATORS__P;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATORS_TWO_PARAMS__Q = BOOLEAN_OPERATORS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Operators Two Params</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATORS_TWO_PARAMS_FEATURE_COUNT = BOOLEAN_OPERATORS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Boolean Operators Two Params</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATORS_TWO_PARAMS_OPERATION_COUNT = BOOLEAN_OPERATORS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link comb.expression.metamodel.comb.impl._and_Impl <em>and </em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comb.expression.metamodel.comb.impl._and_Impl
	 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#get_and_()
	 * @generated
	 */
	int _AND_ = 34;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _AND___NAME = BOOLEAN_OPERATORS_TWO_PARAMS__NAME;

	/**
	 * The feature id for the '<em><b>Subtree Interpretations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _AND___SUBTREE_INTERPRETATIONS = BOOLEAN_OPERATORS_TWO_PARAMS__SUBTREE_INTERPRETATIONS;

	/**
	 * The feature id for the '<em><b>Logic Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _AND___LOGIC_GROUP = BOOLEAN_OPERATORS_TWO_PARAMS__LOGIC_GROUP;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _AND___P = BOOLEAN_OPERATORS_TWO_PARAMS__P;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _AND___Q = BOOLEAN_OPERATORS_TWO_PARAMS__Q;

	/**
	 * The feature id for the '<em><b>Interpretation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _AND___INTERPRETATION = BOOLEAN_OPERATORS_TWO_PARAMS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _AND___DESCRIPTION = BOOLEAN_OPERATORS_TWO_PARAMS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>and </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _AND__FEATURE_COUNT = BOOLEAN_OPERATORS_TWO_PARAMS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>and </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _AND__OPERATION_COUNT = BOOLEAN_OPERATORS_TWO_PARAMS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link comb.expression.metamodel.comb.impl.AbsenceGlobally_Impl <em>Absence Globally </em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comb.expression.metamodel.comb.impl.AbsenceGlobally_Impl
	 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getAbsenceGlobally_()
	 * @generated
	 */
	int ABSENCE_GLOBALLY_ = 35;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSENCE_GLOBALLY___NAME = ABSENCE_WITHOUT_PARAMS__NAME;

	/**
	 * The feature id for the '<em><b>Subtree Interpretations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSENCE_GLOBALLY___SUBTREE_INTERPRETATIONS = ABSENCE_WITHOUT_PARAMS__SUBTREE_INTERPRETATIONS;

	/**
	 * The feature id for the '<em><b>Logic Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSENCE_GLOBALLY___LOGIC_GROUP = ABSENCE_WITHOUT_PARAMS__LOGIC_GROUP;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSENCE_GLOBALLY___P = ABSENCE_WITHOUT_PARAMS__P;

	/**
	 * The feature id for the '<em><b>Interpretation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSENCE_GLOBALLY___INTERPRETATION = ABSENCE_WITHOUT_PARAMS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSENCE_GLOBALLY___DESCRIPTION = ABSENCE_WITHOUT_PARAMS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Absence Globally </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSENCE_GLOBALLY__FEATURE_COUNT = ABSENCE_WITHOUT_PARAMS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Absence Globally </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSENCE_GLOBALLY__OPERATION_COUNT = ABSENCE_WITHOUT_PARAMS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link comb.expression.metamodel.comb.impl.AbsenceBetween_and_Impl <em>Absence Between and </em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comb.expression.metamodel.comb.impl.AbsenceBetween_and_Impl
	 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getAbsenceBetween_and_()
	 * @generated
	 */
	int ABSENCE_BETWEEN_AND_ = 36;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSENCE_BETWEEN_AND___NAME = ABSENCE_TWO_PARAMS__NAME;

	/**
	 * The feature id for the '<em><b>Subtree Interpretations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSENCE_BETWEEN_AND___SUBTREE_INTERPRETATIONS = ABSENCE_TWO_PARAMS__SUBTREE_INTERPRETATIONS;

	/**
	 * The feature id for the '<em><b>Logic Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSENCE_BETWEEN_AND___LOGIC_GROUP = ABSENCE_TWO_PARAMS__LOGIC_GROUP;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSENCE_BETWEEN_AND___P = ABSENCE_TWO_PARAMS__P;

	/**
	 * The feature id for the '<em><b>R</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSENCE_BETWEEN_AND___R = ABSENCE_TWO_PARAMS__R;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSENCE_BETWEEN_AND___Q = ABSENCE_TWO_PARAMS__Q;

	/**
	 * The feature id for the '<em><b>Interpretation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSENCE_BETWEEN_AND___INTERPRETATION = ABSENCE_TWO_PARAMS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSENCE_BETWEEN_AND___DESCRIPTION = ABSENCE_TWO_PARAMS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Absence Between and </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSENCE_BETWEEN_AND__FEATURE_COUNT = ABSENCE_TWO_PARAMS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Absence Between and </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSENCE_BETWEEN_AND__OPERATION_COUNT = ABSENCE_TWO_PARAMS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link comb.expression.metamodel.comb.impl.ExistneceOneParamImpl <em>Existnece One Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comb.expression.metamodel.comb.impl.ExistneceOneParamImpl
	 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getExistneceOneParam()
	 * @generated
	 */
	int EXISTNECE_ONE_PARAM = 37;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTNECE_ONE_PARAM__NAME = EXISTENCE__NAME;

	/**
	 * The feature id for the '<em><b>Subtree Interpretations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTNECE_ONE_PARAM__SUBTREE_INTERPRETATIONS = EXISTENCE__SUBTREE_INTERPRETATIONS;

	/**
	 * The feature id for the '<em><b>Logic Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTNECE_ONE_PARAM__LOGIC_GROUP = EXISTENCE__LOGIC_GROUP;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTNECE_ONE_PARAM__P = EXISTENCE__P;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTNECE_ONE_PARAM__Q = EXISTENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Existnece One Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTNECE_ONE_PARAM_FEATURE_COUNT = EXISTENCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Existnece One Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTNECE_ONE_PARAM_OPERATION_COUNT = EXISTENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link comb.expression.metamodel.comb.impl._or_Impl <em>or </em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comb.expression.metamodel.comb.impl._or_Impl
	 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#get_or_()
	 * @generated
	 */
	int _OR_ = 38;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _OR___NAME = BOOLEAN_OPERATORS_TWO_PARAMS__NAME;

	/**
	 * The feature id for the '<em><b>Subtree Interpretations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _OR___SUBTREE_INTERPRETATIONS = BOOLEAN_OPERATORS_TWO_PARAMS__SUBTREE_INTERPRETATIONS;

	/**
	 * The feature id for the '<em><b>Logic Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _OR___LOGIC_GROUP = BOOLEAN_OPERATORS_TWO_PARAMS__LOGIC_GROUP;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _OR___P = BOOLEAN_OPERATORS_TWO_PARAMS__P;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _OR___Q = BOOLEAN_OPERATORS_TWO_PARAMS__Q;

	/**
	 * The feature id for the '<em><b>Interpretation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _OR___INTERPRETATION = BOOLEAN_OPERATORS_TWO_PARAMS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _OR___DESCRIPTION = BOOLEAN_OPERATORS_TWO_PARAMS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>or </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _OR__FEATURE_COUNT = BOOLEAN_OPERATORS_TWO_PARAMS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>or </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _OR__OPERATION_COUNT = BOOLEAN_OPERATORS_TWO_PARAMS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link comb.expression.metamodel.comb.impl.BasicElementsImpl <em>Basic Elements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comb.expression.metamodel.comb.impl.BasicElementsImpl
	 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getBasicElements()
	 * @generated
	 */
	int BASIC_ELEMENTS = 40;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_ELEMENTS__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Subtree Interpretations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_ELEMENTS__SUBTREE_INTERPRETATIONS = ELEMENT__SUBTREE_INTERPRETATIONS;

	/**
	 * The feature id for the '<em><b>Logic Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_ELEMENTS__LOGIC_GROUP = ELEMENT__LOGIC_GROUP;

	/**
	 * The number of structural features of the '<em>Basic Elements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_ELEMENTS_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Basic Elements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_ELEMENTS_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link comb.expression.metamodel.comb.impl.UniversalityWithoutParamsImpl <em>Universality Without Params</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comb.expression.metamodel.comb.impl.UniversalityWithoutParamsImpl
	 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getUniversalityWithoutParams()
	 * @generated
	 */
	int UNIVERSALITY_WITHOUT_PARAMS = 41;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSALITY_WITHOUT_PARAMS__NAME = UNIVERSALITY__NAME;

	/**
	 * The feature id for the '<em><b>Subtree Interpretations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSALITY_WITHOUT_PARAMS__SUBTREE_INTERPRETATIONS = UNIVERSALITY__SUBTREE_INTERPRETATIONS;

	/**
	 * The feature id for the '<em><b>Logic Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSALITY_WITHOUT_PARAMS__LOGIC_GROUP = UNIVERSALITY__LOGIC_GROUP;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSALITY_WITHOUT_PARAMS__P = UNIVERSALITY__P;

	/**
	 * The number of structural features of the '<em>Universality Without Params</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSALITY_WITHOUT_PARAMS_FEATURE_COUNT = UNIVERSALITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Universality Without Params</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSALITY_WITHOUT_PARAMS_OPERATION_COUNT = UNIVERSALITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link comb.expression.metamodel.comb.impl.ResponseWithoutParamsImpl <em>Response Without Params</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comb.expression.metamodel.comb.impl.ResponseWithoutParamsImpl
	 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getResponseWithoutParams()
	 * @generated
	 */
	int RESPONSE_WITHOUT_PARAMS = 43;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_WITHOUT_PARAMS__NAME = RESPONSE__NAME;

	/**
	 * The feature id for the '<em><b>Subtree Interpretations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_WITHOUT_PARAMS__SUBTREE_INTERPRETATIONS = RESPONSE__SUBTREE_INTERPRETATIONS;

	/**
	 * The feature id for the '<em><b>Logic Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_WITHOUT_PARAMS__LOGIC_GROUP = RESPONSE__LOGIC_GROUP;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_WITHOUT_PARAMS__P = RESPONSE__P;

	/**
	 * The feature id for the '<em><b>S</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_WITHOUT_PARAMS__S = RESPONSE__S;

	/**
	 * The number of structural features of the '<em>Response Without Params</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_WITHOUT_PARAMS_FEATURE_COUNT = RESPONSE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Response Without Params</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_WITHOUT_PARAMS_OPERATION_COUNT = RESPONSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link comb.expression.metamodel.comb.impl.BoundedExistenceAfter_until_Impl <em>Bounded Existence After until </em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comb.expression.metamodel.comb.impl.BoundedExistenceAfter_until_Impl
	 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getBoundedExistenceAfter_until_()
	 * @generated
	 */
	int BOUNDED_EXISTENCE_AFTER_UNTIL_ = 44;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_EXISTENCE_AFTER_UNTIL___NAME = BOUNDED_EXISTENCE_TWO_PARAMS__NAME;

	/**
	 * The feature id for the '<em><b>Subtree Interpretations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_EXISTENCE_AFTER_UNTIL___SUBTREE_INTERPRETATIONS = BOUNDED_EXISTENCE_TWO_PARAMS__SUBTREE_INTERPRETATIONS;

	/**
	 * The feature id for the '<em><b>Logic Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_EXISTENCE_AFTER_UNTIL___LOGIC_GROUP = BOUNDED_EXISTENCE_TWO_PARAMS__LOGIC_GROUP;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_EXISTENCE_AFTER_UNTIL___P = BOUNDED_EXISTENCE_TWO_PARAMS__P;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_EXISTENCE_AFTER_UNTIL___Q = BOUNDED_EXISTENCE_TWO_PARAMS__Q;

	/**
	 * The feature id for the '<em><b>R</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_EXISTENCE_AFTER_UNTIL___R = BOUNDED_EXISTENCE_TWO_PARAMS__R;

	/**
	 * The feature id for the '<em><b>Interpretation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_EXISTENCE_AFTER_UNTIL___INTERPRETATION = BOUNDED_EXISTENCE_TWO_PARAMS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_EXISTENCE_AFTER_UNTIL___DESCRIPTION = BOUNDED_EXISTENCE_TWO_PARAMS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Bounded Existence After until </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_EXISTENCE_AFTER_UNTIL__FEATURE_COUNT = BOUNDED_EXISTENCE_TWO_PARAMS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Bounded Existence After until </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_EXISTENCE_AFTER_UNTIL__OPERATION_COUNT = BOUNDED_EXISTENCE_TWO_PARAMS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link comb.expression.metamodel.comb.impl.ExistenceAfter_Impl <em>Existence After </em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comb.expression.metamodel.comb.impl.ExistenceAfter_Impl
	 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getExistenceAfter_()
	 * @generated
	 */
	int EXISTENCE_AFTER_ = 45;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENCE_AFTER___NAME = EXISTNECE_ONE_PARAM__NAME;

	/**
	 * The feature id for the '<em><b>Subtree Interpretations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENCE_AFTER___SUBTREE_INTERPRETATIONS = EXISTNECE_ONE_PARAM__SUBTREE_INTERPRETATIONS;

	/**
	 * The feature id for the '<em><b>Logic Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENCE_AFTER___LOGIC_GROUP = EXISTNECE_ONE_PARAM__LOGIC_GROUP;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENCE_AFTER___P = EXISTNECE_ONE_PARAM__P;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENCE_AFTER___Q = EXISTNECE_ONE_PARAM__Q;

	/**
	 * The feature id for the '<em><b>Interpretation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENCE_AFTER___INTERPRETATION = EXISTNECE_ONE_PARAM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENCE_AFTER___DESCRIPTION = EXISTNECE_ONE_PARAM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Existence After </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENCE_AFTER__FEATURE_COUNT = EXISTNECE_ONE_PARAM_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Existence After </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENCE_AFTER__OPERATION_COUNT = EXISTNECE_ONE_PARAM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link comb.expression.metamodel.comb.impl.BooleanOperatorsOneParamImpl <em>Boolean Operators One Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comb.expression.metamodel.comb.impl.BooleanOperatorsOneParamImpl
	 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getBooleanOperatorsOneParam()
	 * @generated
	 */
	int BOOLEAN_OPERATORS_ONE_PARAM = 47;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATORS_ONE_PARAM__NAME = BOOLEAN_OPERATORS__NAME;

	/**
	 * The feature id for the '<em><b>Subtree Interpretations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATORS_ONE_PARAM__SUBTREE_INTERPRETATIONS = BOOLEAN_OPERATORS__SUBTREE_INTERPRETATIONS;

	/**
	 * The feature id for the '<em><b>Logic Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATORS_ONE_PARAM__LOGIC_GROUP = BOOLEAN_OPERATORS__LOGIC_GROUP;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATORS_ONE_PARAM__P = BOOLEAN_OPERATORS__P;

	/**
	 * The number of structural features of the '<em>Boolean Operators One Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATORS_ONE_PARAM_FEATURE_COUNT = BOOLEAN_OPERATORS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Boolean Operators One Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATORS_ONE_PARAM_OPERATION_COUNT = BOOLEAN_OPERATORS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link comb.expression.metamodel.comb.impl.UniversalityAfter_until_Impl <em>Universality After until </em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comb.expression.metamodel.comb.impl.UniversalityAfter_until_Impl
	 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getUniversalityAfter_until_()
	 * @generated
	 */
	int UNIVERSALITY_AFTER_UNTIL_ = 50;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSALITY_AFTER_UNTIL___NAME = UNIVERSALITY_TWO_PARAMS__NAME;

	/**
	 * The feature id for the '<em><b>Subtree Interpretations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSALITY_AFTER_UNTIL___SUBTREE_INTERPRETATIONS = UNIVERSALITY_TWO_PARAMS__SUBTREE_INTERPRETATIONS;

	/**
	 * The feature id for the '<em><b>Logic Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSALITY_AFTER_UNTIL___LOGIC_GROUP = UNIVERSALITY_TWO_PARAMS__LOGIC_GROUP;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSALITY_AFTER_UNTIL___P = UNIVERSALITY_TWO_PARAMS__P;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSALITY_AFTER_UNTIL___Q = UNIVERSALITY_TWO_PARAMS__Q;

	/**
	 * The feature id for the '<em><b>R</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSALITY_AFTER_UNTIL___R = UNIVERSALITY_TWO_PARAMS__R;

	/**
	 * The feature id for the '<em><b>Interpretation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSALITY_AFTER_UNTIL___INTERPRETATION = UNIVERSALITY_TWO_PARAMS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSALITY_AFTER_UNTIL___DESCRIPTION = UNIVERSALITY_TWO_PARAMS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Universality After until </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSALITY_AFTER_UNTIL__FEATURE_COUNT = UNIVERSALITY_TWO_PARAMS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Universality After until </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSALITY_AFTER_UNTIL__OPERATION_COUNT = UNIVERSALITY_TWO_PARAMS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link comb.expression.metamodel.comb.impl.ResponseGlobally_Impl <em>Response Globally </em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comb.expression.metamodel.comb.impl.ResponseGlobally_Impl
	 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getResponseGlobally_()
	 * @generated
	 */
	int RESPONSE_GLOBALLY_ = 51;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_GLOBALLY___NAME = RESPONSE_WITHOUT_PARAMS__NAME;

	/**
	 * The feature id for the '<em><b>Subtree Interpretations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_GLOBALLY___SUBTREE_INTERPRETATIONS = RESPONSE_WITHOUT_PARAMS__SUBTREE_INTERPRETATIONS;

	/**
	 * The feature id for the '<em><b>Logic Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_GLOBALLY___LOGIC_GROUP = RESPONSE_WITHOUT_PARAMS__LOGIC_GROUP;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_GLOBALLY___P = RESPONSE_WITHOUT_PARAMS__P;

	/**
	 * The feature id for the '<em><b>S</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_GLOBALLY___S = RESPONSE_WITHOUT_PARAMS__S;

	/**
	 * The feature id for the '<em><b>Interpretation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_GLOBALLY___INTERPRETATION = RESPONSE_WITHOUT_PARAMS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_GLOBALLY___DESCRIPTION = RESPONSE_WITHOUT_PARAMS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Response Globally </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_GLOBALLY__FEATURE_COUNT = RESPONSE_WITHOUT_PARAMS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Response Globally </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_GLOBALLY__OPERATION_COUNT = RESPONSE_WITHOUT_PARAMS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link comb.expression.metamodel.comb.impl.ExistenceGlobally_Impl <em>Existence Globally </em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comb.expression.metamodel.comb.impl.ExistenceGlobally_Impl
	 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getExistenceGlobally_()
	 * @generated
	 */
	int EXISTENCE_GLOBALLY_ = 52;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENCE_GLOBALLY___NAME = EXISTENCE_WITHOUR_PARAMS__NAME;

	/**
	 * The feature id for the '<em><b>Subtree Interpretations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENCE_GLOBALLY___SUBTREE_INTERPRETATIONS = EXISTENCE_WITHOUR_PARAMS__SUBTREE_INTERPRETATIONS;

	/**
	 * The feature id for the '<em><b>Logic Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENCE_GLOBALLY___LOGIC_GROUP = EXISTENCE_WITHOUR_PARAMS__LOGIC_GROUP;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENCE_GLOBALLY___P = EXISTENCE_WITHOUR_PARAMS__P;

	/**
	 * The feature id for the '<em><b>Interpretation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENCE_GLOBALLY___INTERPRETATION = EXISTENCE_WITHOUR_PARAMS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENCE_GLOBALLY___DESCRIPTION = EXISTENCE_WITHOUR_PARAMS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Existence Globally </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENCE_GLOBALLY__FEATURE_COUNT = EXISTENCE_WITHOUR_PARAMS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Existence Globally </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENCE_GLOBALLY__OPERATION_COUNT = EXISTENCE_WITHOUR_PARAMS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link comb.expression.metamodel.comb.impl.BoundedExistenceBefore_Impl <em>Bounded Existence Before </em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comb.expression.metamodel.comb.impl.BoundedExistenceBefore_Impl
	 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getBoundedExistenceBefore_()
	 * @generated
	 */
	int BOUNDED_EXISTENCE_BEFORE_ = 53;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_EXISTENCE_BEFORE___NAME = BOUNDED_EXISTNECE_ONE_PARAM__NAME;

	/**
	 * The feature id for the '<em><b>Subtree Interpretations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_EXISTENCE_BEFORE___SUBTREE_INTERPRETATIONS = BOUNDED_EXISTNECE_ONE_PARAM__SUBTREE_INTERPRETATIONS;

	/**
	 * The feature id for the '<em><b>Logic Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_EXISTENCE_BEFORE___LOGIC_GROUP = BOUNDED_EXISTNECE_ONE_PARAM__LOGIC_GROUP;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_EXISTENCE_BEFORE___P = BOUNDED_EXISTNECE_ONE_PARAM__P;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_EXISTENCE_BEFORE___Q = BOUNDED_EXISTNECE_ONE_PARAM__Q;

	/**
	 * The feature id for the '<em><b>Interpretation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_EXISTENCE_BEFORE___INTERPRETATION = BOUNDED_EXISTNECE_ONE_PARAM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_EXISTENCE_BEFORE___DESCRIPTION = BOUNDED_EXISTNECE_ONE_PARAM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Bounded Existence Before </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_EXISTENCE_BEFORE__FEATURE_COUNT = BOUNDED_EXISTNECE_ONE_PARAM_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Bounded Existence Before </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_EXISTENCE_BEFORE__OPERATION_COUNT = BOUNDED_EXISTNECE_ONE_PARAM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link comb.expression.metamodel.comb.impl.Eventually_Impl <em>Eventually </em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comb.expression.metamodel.comb.impl.Eventually_Impl
	 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getEventually_()
	 * @generated
	 */
	int EVENTUALLY_ = 54;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENTUALLY___NAME = LTL_OPERATORS_ONE_PARAM__NAME;

	/**
	 * The feature id for the '<em><b>Subtree Interpretations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENTUALLY___SUBTREE_INTERPRETATIONS = LTL_OPERATORS_ONE_PARAM__SUBTREE_INTERPRETATIONS;

	/**
	 * The feature id for the '<em><b>Logic Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENTUALLY___LOGIC_GROUP = LTL_OPERATORS_ONE_PARAM__LOGIC_GROUP;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENTUALLY___P = LTL_OPERATORS_ONE_PARAM__P;

	/**
	 * The feature id for the '<em><b>Interpretation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENTUALLY___INTERPRETATION = LTL_OPERATORS_ONE_PARAM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENTUALLY___DESCRIPTION = LTL_OPERATORS_ONE_PARAM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Eventually </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENTUALLY__FEATURE_COUNT = LTL_OPERATORS_ONE_PARAM_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Eventually </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENTUALLY__OPERATION_COUNT = LTL_OPERATORS_ONE_PARAM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link comb.expression.metamodel.comb.impl._implies_Impl <em>implies </em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comb.expression.metamodel.comb.impl._implies_Impl
	 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#get_implies_()
	 * @generated
	 */
	int _IMPLIES_ = 55;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _IMPLIES___NAME = BOOLEAN_OPERATORS_TWO_PARAMS__NAME;

	/**
	 * The feature id for the '<em><b>Subtree Interpretations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _IMPLIES___SUBTREE_INTERPRETATIONS = BOOLEAN_OPERATORS_TWO_PARAMS__SUBTREE_INTERPRETATIONS;

	/**
	 * The feature id for the '<em><b>Logic Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _IMPLIES___LOGIC_GROUP = BOOLEAN_OPERATORS_TWO_PARAMS__LOGIC_GROUP;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _IMPLIES___P = BOOLEAN_OPERATORS_TWO_PARAMS__P;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _IMPLIES___Q = BOOLEAN_OPERATORS_TWO_PARAMS__Q;

	/**
	 * The feature id for the '<em><b>Interpretation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _IMPLIES___INTERPRETATION = BOOLEAN_OPERATORS_TWO_PARAMS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _IMPLIES___DESCRIPTION = BOOLEAN_OPERATORS_TWO_PARAMS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>implies </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _IMPLIES__FEATURE_COUNT = BOOLEAN_OPERATORS_TWO_PARAMS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>implies </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _IMPLIES__OPERATION_COUNT = BOOLEAN_OPERATORS_TWO_PARAMS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link comb.expression.metamodel.comb.impl.UniversalityGlobally_Impl <em>Universality Globally </em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comb.expression.metamodel.comb.impl.UniversalityGlobally_Impl
	 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getUniversalityGlobally_()
	 * @generated
	 */
	int UNIVERSALITY_GLOBALLY_ = 56;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSALITY_GLOBALLY___NAME = UNIVERSALITY_WITHOUT_PARAMS__NAME;

	/**
	 * The feature id for the '<em><b>Subtree Interpretations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSALITY_GLOBALLY___SUBTREE_INTERPRETATIONS = UNIVERSALITY_WITHOUT_PARAMS__SUBTREE_INTERPRETATIONS;

	/**
	 * The feature id for the '<em><b>Logic Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSALITY_GLOBALLY___LOGIC_GROUP = UNIVERSALITY_WITHOUT_PARAMS__LOGIC_GROUP;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSALITY_GLOBALLY___P = UNIVERSALITY_WITHOUT_PARAMS__P;

	/**
	 * The feature id for the '<em><b>Interpretation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSALITY_GLOBALLY___INTERPRETATION = UNIVERSALITY_WITHOUT_PARAMS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSALITY_GLOBALLY___DESCRIPTION = UNIVERSALITY_WITHOUT_PARAMS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Universality Globally </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSALITY_GLOBALLY__FEATURE_COUNT = UNIVERSALITY_WITHOUT_PARAMS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Universality Globally </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSALITY_GLOBALLY__OPERATION_COUNT = UNIVERSALITY_WITHOUT_PARAMS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link comb.expression.metamodel.comb.impl.AbsenceAfter_Impl <em>Absence After </em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comb.expression.metamodel.comb.impl.AbsenceAfter_Impl
	 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getAbsenceAfter_()
	 * @generated
	 */
	int ABSENCE_AFTER_ = 58;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSENCE_AFTER___NAME = ABSENCE_ONE_PARAM__NAME;

	/**
	 * The feature id for the '<em><b>Subtree Interpretations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSENCE_AFTER___SUBTREE_INTERPRETATIONS = ABSENCE_ONE_PARAM__SUBTREE_INTERPRETATIONS;

	/**
	 * The feature id for the '<em><b>Logic Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSENCE_AFTER___LOGIC_GROUP = ABSENCE_ONE_PARAM__LOGIC_GROUP;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSENCE_AFTER___P = ABSENCE_ONE_PARAM__P;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSENCE_AFTER___Q = ABSENCE_ONE_PARAM__Q;

	/**
	 * The feature id for the '<em><b>Interpretation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSENCE_AFTER___INTERPRETATION = ABSENCE_ONE_PARAM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSENCE_AFTER___DESCRIPTION = ABSENCE_ONE_PARAM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Absence After </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSENCE_AFTER__FEATURE_COUNT = ABSENCE_ONE_PARAM_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Absence After </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSENCE_AFTER__OPERATION_COUNT = ABSENCE_ONE_PARAM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link comb.expression.metamodel.comb.impl.ExistenceBefore_Impl <em>Existence Before </em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comb.expression.metamodel.comb.impl.ExistenceBefore_Impl
	 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getExistenceBefore_()
	 * @generated
	 */
	int EXISTENCE_BEFORE_ = 62;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENCE_BEFORE___NAME = EXISTNECE_ONE_PARAM__NAME;

	/**
	 * The feature id for the '<em><b>Subtree Interpretations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENCE_BEFORE___SUBTREE_INTERPRETATIONS = EXISTNECE_ONE_PARAM__SUBTREE_INTERPRETATIONS;

	/**
	 * The feature id for the '<em><b>Logic Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENCE_BEFORE___LOGIC_GROUP = EXISTNECE_ONE_PARAM__LOGIC_GROUP;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENCE_BEFORE___P = EXISTNECE_ONE_PARAM__P;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENCE_BEFORE___Q = EXISTNECE_ONE_PARAM__Q;

	/**
	 * The feature id for the '<em><b>Interpretation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENCE_BEFORE___INTERPRETATION = EXISTNECE_ONE_PARAM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENCE_BEFORE___DESCRIPTION = EXISTNECE_ONE_PARAM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Existence Before </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENCE_BEFORE__FEATURE_COUNT = EXISTNECE_ONE_PARAM_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Existence Before </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENCE_BEFORE__OPERATION_COUNT = EXISTNECE_ONE_PARAM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link comb.expression.metamodel.comb.impl.PrecedenceGlobally_Impl <em>Precedence Globally </em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comb.expression.metamodel.comb.impl.PrecedenceGlobally_Impl
	 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getPrecedenceGlobally_()
	 * @generated
	 */
	int PRECEDENCE_GLOBALLY_ = 66;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_GLOBALLY___NAME = PRECEDENCE_WITHOUT_PARAMS__NAME;

	/**
	 * The feature id for the '<em><b>Subtree Interpretations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_GLOBALLY___SUBTREE_INTERPRETATIONS = PRECEDENCE_WITHOUT_PARAMS__SUBTREE_INTERPRETATIONS;

	/**
	 * The feature id for the '<em><b>Logic Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_GLOBALLY___LOGIC_GROUP = PRECEDENCE_WITHOUT_PARAMS__LOGIC_GROUP;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_GLOBALLY___P = PRECEDENCE_WITHOUT_PARAMS__P;

	/**
	 * The feature id for the '<em><b>S</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_GLOBALLY___S = PRECEDENCE_WITHOUT_PARAMS__S;

	/**
	 * The feature id for the '<em><b>Interpretation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_GLOBALLY___INTERPRETATION = PRECEDENCE_WITHOUT_PARAMS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_GLOBALLY___DESCRIPTION = PRECEDENCE_WITHOUT_PARAMS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Precedence Globally </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_GLOBALLY__FEATURE_COUNT = PRECEDENCE_WITHOUT_PARAMS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Precedence Globally </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_GLOBALLY__OPERATION_COUNT = PRECEDENCE_WITHOUT_PARAMS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link comb.expression.metamodel.comb.impl.LiteralImpl <em>Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comb.expression.metamodel.comb.impl.LiteralImpl
	 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getLiteral()
	 * @generated
	 */
	int LITERAL = 67;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__NAME = BASIC_ELEMENTS__NAME;

	/**
	 * The feature id for the '<em><b>Subtree Interpretations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__SUBTREE_INTERPRETATIONS = BASIC_ELEMENTS__SUBTREE_INTERPRETATIONS;

	/**
	 * The feature id for the '<em><b>Logic Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__LOGIC_GROUP = BASIC_ELEMENTS__LOGIC_GROUP;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__DESCRIPTION = BASIC_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_FEATURE_COUNT = BASIC_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_OPERATION_COUNT = BASIC_ELEMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link comb.expression.metamodel.comb.impl.Next_Impl <em>Next </em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comb.expression.metamodel.comb.impl.Next_Impl
	 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getNext_()
	 * @generated
	 */
	int NEXT_ = 68;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEXT___NAME = LTL_OPERATORS_ONE_PARAM__NAME;

	/**
	 * The feature id for the '<em><b>Subtree Interpretations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEXT___SUBTREE_INTERPRETATIONS = LTL_OPERATORS_ONE_PARAM__SUBTREE_INTERPRETATIONS;

	/**
	 * The feature id for the '<em><b>Logic Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEXT___LOGIC_GROUP = LTL_OPERATORS_ONE_PARAM__LOGIC_GROUP;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEXT___P = LTL_OPERATORS_ONE_PARAM__P;

	/**
	 * The feature id for the '<em><b>Interpretation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEXT___INTERPRETATION = LTL_OPERATORS_ONE_PARAM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEXT___DESCRIPTION = LTL_OPERATORS_ONE_PARAM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Next </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEXT__FEATURE_COUNT = LTL_OPERATORS_ONE_PARAM_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Next </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEXT__OPERATION_COUNT = LTL_OPERATORS_ONE_PARAM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link comb.expression.metamodel.comb.impl.Not_Impl <em>Not </em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comb.expression.metamodel.comb.impl.Not_Impl
	 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getNot_()
	 * @generated
	 */
	int NOT_ = 70;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT___NAME = BOOLEAN_OPERATORS_ONE_PARAM__NAME;

	/**
	 * The feature id for the '<em><b>Subtree Interpretations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT___SUBTREE_INTERPRETATIONS = BOOLEAN_OPERATORS_ONE_PARAM__SUBTREE_INTERPRETATIONS;

	/**
	 * The feature id for the '<em><b>Logic Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT___LOGIC_GROUP = BOOLEAN_OPERATORS_ONE_PARAM__LOGIC_GROUP;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT___P = BOOLEAN_OPERATORS_ONE_PARAM__P;

	/**
	 * The feature id for the '<em><b>Interpretation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT___INTERPRETATION = BOOLEAN_OPERATORS_ONE_PARAM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT___DESCRIPTION = BOOLEAN_OPERATORS_ONE_PARAM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Not </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT__FEATURE_COUNT = BOOLEAN_OPERATORS_ONE_PARAM_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Not </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT__OPERATION_COUNT = BOOLEAN_OPERATORS_ONE_PARAM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link comb.expression.metamodel.comb.impl.MITLOperatorsImpl <em>MITL Operators</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comb.expression.metamodel.comb.impl.MITLOperatorsImpl
	 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getMITLOperators()
	 * @generated
	 */
	int MITL_OPERATORS = 76;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MITL_OPERATORS__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Subtree Interpretations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MITL_OPERATORS__SUBTREE_INTERPRETATIONS = ELEMENT__SUBTREE_INTERPRETATIONS;

	/**
	 * The feature id for the '<em><b>Logic Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MITL_OPERATORS__LOGIC_GROUP = ELEMENT__LOGIC_GROUP;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MITL_OPERATORS__P = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MITL Operators</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MITL_OPERATORS_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>MITL Operators</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MITL_OPERATORS_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link comb.expression.metamodel.comb.impl.MITLOperatorsOneParamImpl <em>MITL Operators One Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comb.expression.metamodel.comb.impl.MITLOperatorsOneParamImpl
	 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getMITLOperatorsOneParam()
	 * @generated
	 */
	int MITL_OPERATORS_ONE_PARAM = 77;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MITL_OPERATORS_ONE_PARAM__NAME = MITL_OPERATORS__NAME;

	/**
	 * The feature id for the '<em><b>Subtree Interpretations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MITL_OPERATORS_ONE_PARAM__SUBTREE_INTERPRETATIONS = MITL_OPERATORS__SUBTREE_INTERPRETATIONS;

	/**
	 * The feature id for the '<em><b>Logic Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MITL_OPERATORS_ONE_PARAM__LOGIC_GROUP = MITL_OPERATORS__LOGIC_GROUP;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MITL_OPERATORS_ONE_PARAM__P = MITL_OPERATORS__P;

	/**
	 * The number of structural features of the '<em>MITL Operators One Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MITL_OPERATORS_ONE_PARAM_FEATURE_COUNT = MITL_OPERATORS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>MITL Operators One Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MITL_OPERATORS_ONE_PARAM_OPERATION_COUNT = MITL_OPERATORS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link comb.expression.metamodel.comb.impl.EventuallyWithin_and_Impl <em>Eventually Within and </em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comb.expression.metamodel.comb.impl.EventuallyWithin_and_Impl
	 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getEventuallyWithin_and_()
	 * @generated
	 */
	int EVENTUALLY_WITHIN_AND_ = 73;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENTUALLY_WITHIN_AND___NAME = MITL_OPERATORS_ONE_PARAM__NAME;

	/**
	 * The feature id for the '<em><b>Subtree Interpretations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENTUALLY_WITHIN_AND___SUBTREE_INTERPRETATIONS = MITL_OPERATORS_ONE_PARAM__SUBTREE_INTERPRETATIONS;

	/**
	 * The feature id for the '<em><b>Logic Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENTUALLY_WITHIN_AND___LOGIC_GROUP = MITL_OPERATORS_ONE_PARAM__LOGIC_GROUP;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENTUALLY_WITHIN_AND___P = MITL_OPERATORS_ONE_PARAM__P;

	/**
	 * The feature id for the '<em><b>Interpretation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENTUALLY_WITHIN_AND___INTERPRETATION = MITL_OPERATORS_ONE_PARAM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENTUALLY_WITHIN_AND___DESCRIPTION = MITL_OPERATORS_ONE_PARAM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>L</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENTUALLY_WITHIN_AND___L = MITL_OPERATORS_ONE_PARAM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>H</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENTUALLY_WITHIN_AND___H = MITL_OPERATORS_ONE_PARAM_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Eventually Within and </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENTUALLY_WITHIN_AND__FEATURE_COUNT = MITL_OPERATORS_ONE_PARAM_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Eventually Within and </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENTUALLY_WITHIN_AND__OPERATION_COUNT = MITL_OPERATORS_ONE_PARAM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link comb.expression.metamodel.comb.impl.MITLOperatorsTwoParamsImpl <em>MITL Operators Two Params</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comb.expression.metamodel.comb.impl.MITLOperatorsTwoParamsImpl
	 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getMITLOperatorsTwoParams()
	 * @generated
	 */
	int MITL_OPERATORS_TWO_PARAMS = 78;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MITL_OPERATORS_TWO_PARAMS__NAME = MITL_OPERATORS__NAME;

	/**
	 * The feature id for the '<em><b>Subtree Interpretations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MITL_OPERATORS_TWO_PARAMS__SUBTREE_INTERPRETATIONS = MITL_OPERATORS__SUBTREE_INTERPRETATIONS;

	/**
	 * The feature id for the '<em><b>Logic Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MITL_OPERATORS_TWO_PARAMS__LOGIC_GROUP = MITL_OPERATORS__LOGIC_GROUP;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MITL_OPERATORS_TWO_PARAMS__P = MITL_OPERATORS__P;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MITL_OPERATORS_TWO_PARAMS__Q = MITL_OPERATORS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MITL Operators Two Params</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MITL_OPERATORS_TWO_PARAMS_FEATURE_COUNT = MITL_OPERATORS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>MITL Operators Two Params</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MITL_OPERATORS_TWO_PARAMS_OPERATION_COUNT = MITL_OPERATORS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link comb.expression.metamodel.comb.impl._untilWithin_and_Impl <em>until Within and </em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comb.expression.metamodel.comb.impl._untilWithin_and_Impl
	 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#get_untilWithin_and_()
	 * @generated
	 */
	int _UNTIL_WITHIN_AND_ = 74;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _UNTIL_WITHIN_AND___NAME = MITL_OPERATORS_TWO_PARAMS__NAME;

	/**
	 * The feature id for the '<em><b>Subtree Interpretations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _UNTIL_WITHIN_AND___SUBTREE_INTERPRETATIONS = MITL_OPERATORS_TWO_PARAMS__SUBTREE_INTERPRETATIONS;

	/**
	 * The feature id for the '<em><b>Logic Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _UNTIL_WITHIN_AND___LOGIC_GROUP = MITL_OPERATORS_TWO_PARAMS__LOGIC_GROUP;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _UNTIL_WITHIN_AND___P = MITL_OPERATORS_TWO_PARAMS__P;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _UNTIL_WITHIN_AND___Q = MITL_OPERATORS_TWO_PARAMS__Q;

	/**
	 * The feature id for the '<em><b>Interpretation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _UNTIL_WITHIN_AND___INTERPRETATION = MITL_OPERATORS_TWO_PARAMS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _UNTIL_WITHIN_AND___DESCRIPTION = MITL_OPERATORS_TWO_PARAMS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>L</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _UNTIL_WITHIN_AND___L = MITL_OPERATORS_TWO_PARAMS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>H</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _UNTIL_WITHIN_AND___H = MITL_OPERATORS_TWO_PARAMS_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>until Within and </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _UNTIL_WITHIN_AND__FEATURE_COUNT = MITL_OPERATORS_TWO_PARAMS_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>until Within and </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _UNTIL_WITHIN_AND__OPERATION_COUNT = MITL_OPERATORS_TWO_PARAMS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link comb.expression.metamodel.comb.impl.AlwaysWithin_and_Impl <em>Always Within and </em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comb.expression.metamodel.comb.impl.AlwaysWithin_and_Impl
	 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getAlwaysWithin_and_()
	 * @generated
	 */
	int ALWAYS_WITHIN_AND_ = 75;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALWAYS_WITHIN_AND___NAME = MITL_OPERATORS_ONE_PARAM__NAME;

	/**
	 * The feature id for the '<em><b>Subtree Interpretations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALWAYS_WITHIN_AND___SUBTREE_INTERPRETATIONS = MITL_OPERATORS_ONE_PARAM__SUBTREE_INTERPRETATIONS;

	/**
	 * The feature id for the '<em><b>Logic Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALWAYS_WITHIN_AND___LOGIC_GROUP = MITL_OPERATORS_ONE_PARAM__LOGIC_GROUP;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALWAYS_WITHIN_AND___P = MITL_OPERATORS_ONE_PARAM__P;

	/**
	 * The feature id for the '<em><b>Interpretation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALWAYS_WITHIN_AND___INTERPRETATION = MITL_OPERATORS_ONE_PARAM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALWAYS_WITHIN_AND___DESCRIPTION = MITL_OPERATORS_ONE_PARAM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>L</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALWAYS_WITHIN_AND___L = MITL_OPERATORS_ONE_PARAM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>H</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALWAYS_WITHIN_AND___H = MITL_OPERATORS_ONE_PARAM_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Always Within and </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALWAYS_WITHIN_AND__FEATURE_COUNT = MITL_OPERATORS_ONE_PARAM_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Always Within and </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALWAYS_WITHIN_AND__OPERATION_COUNT = MITL_OPERATORS_ONE_PARAM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link comb.expression.metamodel.comb.impl.CombImpl <em>Comb</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comb.expression.metamodel.comb.impl.CombImpl
	 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getComb()
	 * @generated
	 */
	int COMB = 79;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMB__ELEMENT = 0;

	/**
	 * The number of structural features of the '<em>Comb</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMB_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Comb</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMB_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link comb.expression.metamodel.comb.impl.MTLOperatorsImpl <em>MTL Operators</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comb.expression.metamodel.comb.impl.MTLOperatorsImpl
	 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getMTLOperators()
	 * @generated
	 */
	int MTL_OPERATORS = 80;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTL_OPERATORS__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Subtree Interpretations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTL_OPERATORS__SUBTREE_INTERPRETATIONS = ELEMENT__SUBTREE_INTERPRETATIONS;

	/**
	 * The feature id for the '<em><b>Logic Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTL_OPERATORS__LOGIC_GROUP = ELEMENT__LOGIC_GROUP;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTL_OPERATORS__P = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MTL Operators</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTL_OPERATORS_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>MTL Operators</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTL_OPERATORS_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link comb.expression.metamodel.comb.impl.MTLOperatorsOneParamImpl <em>MTL Operators One Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comb.expression.metamodel.comb.impl.MTLOperatorsOneParamImpl
	 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getMTLOperatorsOneParam()
	 * @generated
	 */
	int MTL_OPERATORS_ONE_PARAM = 81;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTL_OPERATORS_ONE_PARAM__NAME = MTL_OPERATORS__NAME;

	/**
	 * The feature id for the '<em><b>Subtree Interpretations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTL_OPERATORS_ONE_PARAM__SUBTREE_INTERPRETATIONS = MTL_OPERATORS__SUBTREE_INTERPRETATIONS;

	/**
	 * The feature id for the '<em><b>Logic Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTL_OPERATORS_ONE_PARAM__LOGIC_GROUP = MTL_OPERATORS__LOGIC_GROUP;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTL_OPERATORS_ONE_PARAM__P = MTL_OPERATORS__P;

	/**
	 * The number of structural features of the '<em>MTL Operators One Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTL_OPERATORS_ONE_PARAM_FEATURE_COUNT = MTL_OPERATORS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>MTL Operators One Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTL_OPERATORS_ONE_PARAM_OPERATION_COUNT = MTL_OPERATORS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link comb.expression.metamodel.comb.impl.MTLOperatorsTwoParamsImpl <em>MTL Operators Two Params</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comb.expression.metamodel.comb.impl.MTLOperatorsTwoParamsImpl
	 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getMTLOperatorsTwoParams()
	 * @generated
	 */
	int MTL_OPERATORS_TWO_PARAMS = 82;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTL_OPERATORS_TWO_PARAMS__NAME = MTL_OPERATORS__NAME;

	/**
	 * The feature id for the '<em><b>Subtree Interpretations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTL_OPERATORS_TWO_PARAMS__SUBTREE_INTERPRETATIONS = MTL_OPERATORS__SUBTREE_INTERPRETATIONS;

	/**
	 * The feature id for the '<em><b>Logic Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTL_OPERATORS_TWO_PARAMS__LOGIC_GROUP = MTL_OPERATORS__LOGIC_GROUP;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTL_OPERATORS_TWO_PARAMS__P = MTL_OPERATORS__P;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTL_OPERATORS_TWO_PARAMS__Q = MTL_OPERATORS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MTL Operators Two Params</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTL_OPERATORS_TWO_PARAMS_FEATURE_COUNT = MTL_OPERATORS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>MTL Operators Two Params</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTL_OPERATORS_TWO_PARAMS_OPERATION_COUNT = MTL_OPERATORS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link comb.expression.metamodel.comb.impl._untilWithin_Impl <em>until Within </em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comb.expression.metamodel.comb.impl._untilWithin_Impl
	 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#get_untilWithin_()
	 * @generated
	 */
	int _UNTIL_WITHIN_ = 83;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _UNTIL_WITHIN___NAME = MTL_OPERATORS_TWO_PARAMS__NAME;

	/**
	 * The feature id for the '<em><b>Subtree Interpretations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _UNTIL_WITHIN___SUBTREE_INTERPRETATIONS = MTL_OPERATORS_TWO_PARAMS__SUBTREE_INTERPRETATIONS;

	/**
	 * The feature id for the '<em><b>Logic Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _UNTIL_WITHIN___LOGIC_GROUP = MTL_OPERATORS_TWO_PARAMS__LOGIC_GROUP;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _UNTIL_WITHIN___P = MTL_OPERATORS_TWO_PARAMS__P;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _UNTIL_WITHIN___Q = MTL_OPERATORS_TWO_PARAMS__Q;

	/**
	 * The feature id for the '<em><b>Interpretation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _UNTIL_WITHIN___INTERPRETATION = MTL_OPERATORS_TWO_PARAMS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _UNTIL_WITHIN___DESCRIPTION = MTL_OPERATORS_TWO_PARAMS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>H</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _UNTIL_WITHIN___H = MTL_OPERATORS_TWO_PARAMS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>until Within </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _UNTIL_WITHIN__FEATURE_COUNT = MTL_OPERATORS_TWO_PARAMS_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>until Within </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _UNTIL_WITHIN__OPERATION_COUNT = MTL_OPERATORS_TWO_PARAMS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link comb.expression.metamodel.comb.impl.AlwaysWithin_Impl <em>Always Within </em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comb.expression.metamodel.comb.impl.AlwaysWithin_Impl
	 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getAlwaysWithin_()
	 * @generated
	 */
	int ALWAYS_WITHIN_ = 84;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALWAYS_WITHIN___NAME = MTL_OPERATORS_ONE_PARAM__NAME;

	/**
	 * The feature id for the '<em><b>Subtree Interpretations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALWAYS_WITHIN___SUBTREE_INTERPRETATIONS = MTL_OPERATORS_ONE_PARAM__SUBTREE_INTERPRETATIONS;

	/**
	 * The feature id for the '<em><b>Logic Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALWAYS_WITHIN___LOGIC_GROUP = MTL_OPERATORS_ONE_PARAM__LOGIC_GROUP;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALWAYS_WITHIN___P = MTL_OPERATORS_ONE_PARAM__P;

	/**
	 * The feature id for the '<em><b>Interpretation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALWAYS_WITHIN___INTERPRETATION = MTL_OPERATORS_ONE_PARAM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALWAYS_WITHIN___DESCRIPTION = MTL_OPERATORS_ONE_PARAM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>H</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALWAYS_WITHIN___H = MTL_OPERATORS_ONE_PARAM_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Always Within </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALWAYS_WITHIN__FEATURE_COUNT = MTL_OPERATORS_ONE_PARAM_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Always Within </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALWAYS_WITHIN__OPERATION_COUNT = MTL_OPERATORS_ONE_PARAM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link comb.expression.metamodel.comb.impl.EventuallyWithin_Impl <em>Eventually Within </em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comb.expression.metamodel.comb.impl.EventuallyWithin_Impl
	 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getEventuallyWithin_()
	 * @generated
	 */
	int EVENTUALLY_WITHIN_ = 85;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENTUALLY_WITHIN___NAME = MTL_OPERATORS_ONE_PARAM__NAME;

	/**
	 * The feature id for the '<em><b>Subtree Interpretations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENTUALLY_WITHIN___SUBTREE_INTERPRETATIONS = MTL_OPERATORS_ONE_PARAM__SUBTREE_INTERPRETATIONS;

	/**
	 * The feature id for the '<em><b>Logic Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENTUALLY_WITHIN___LOGIC_GROUP = MTL_OPERATORS_ONE_PARAM__LOGIC_GROUP;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENTUALLY_WITHIN___P = MTL_OPERATORS_ONE_PARAM__P;

	/**
	 * The feature id for the '<em><b>Interpretation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENTUALLY_WITHIN___INTERPRETATION = MTL_OPERATORS_ONE_PARAM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENTUALLY_WITHIN___DESCRIPTION = MTL_OPERATORS_ONE_PARAM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>H</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENTUALLY_WITHIN___H = MTL_OPERATORS_ONE_PARAM_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Eventually Within </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENTUALLY_WITHIN__FEATURE_COUNT = MTL_OPERATORS_ONE_PARAM_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Eventually Within </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENTUALLY_WITHIN__OPERATION_COUNT = MTL_OPERATORS_ONE_PARAM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link comb.expression.metamodel.comb.impl.STLOperatorsImpl <em>STL Operators</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comb.expression.metamodel.comb.impl.STLOperatorsImpl
	 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getSTLOperators()
	 * @generated
	 */
	int STL_OPERATORS = 92;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STL_OPERATORS__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Subtree Interpretations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STL_OPERATORS__SUBTREE_INTERPRETATIONS = ELEMENT__SUBTREE_INTERPRETATIONS;

	/**
	 * The feature id for the '<em><b>Logic Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STL_OPERATORS__LOGIC_GROUP = ELEMENT__LOGIC_GROUP;

	/**
	 * The number of structural features of the '<em>STL Operators</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STL_OPERATORS_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>STL Operators</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STL_OPERATORS_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link comb.expression.metamodel.comb.impl.RelationImpl <em>Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comb.expression.metamodel.comb.impl.RelationImpl
	 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getRelation()
	 * @generated
	 */
	int RELATION = 86;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__NAME = STL_OPERATORS__NAME;

	/**
	 * The feature id for the '<em><b>Subtree Interpretations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__SUBTREE_INTERPRETATIONS = STL_OPERATORS__SUBTREE_INTERPRETATIONS;

	/**
	 * The feature id for the '<em><b>Logic Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__LOGIC_GROUP = STL_OPERATORS__LOGIC_GROUP;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__P = STL_OPERATORS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__Q = STL_OPERATORS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_FEATURE_COUNT = STL_OPERATORS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_OPERATION_COUNT = STL_OPERATORS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link comb.expression.metamodel.comb.impl._lessThan_Impl <em>less Than </em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comb.expression.metamodel.comb.impl._lessThan_Impl
	 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#get_lessThan_()
	 * @generated
	 */
	int _LESS_THAN_ = 87;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _LESS_THAN___NAME = RELATION__NAME;

	/**
	 * The feature id for the '<em><b>Subtree Interpretations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _LESS_THAN___SUBTREE_INTERPRETATIONS = RELATION__SUBTREE_INTERPRETATIONS;

	/**
	 * The feature id for the '<em><b>Logic Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _LESS_THAN___LOGIC_GROUP = RELATION__LOGIC_GROUP;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _LESS_THAN___P = RELATION__P;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _LESS_THAN___Q = RELATION__Q;

	/**
	 * The feature id for the '<em><b>Interpretation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _LESS_THAN___INTERPRETATION = RELATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _LESS_THAN___DESCRIPTION = RELATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>less Than </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _LESS_THAN__FEATURE_COUNT = RELATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>less Than </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _LESS_THAN__OPERATION_COUNT = RELATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link comb.expression.metamodel.comb.impl._lessThanOrEqual_Impl <em>less Than Or Equal </em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comb.expression.metamodel.comb.impl._lessThanOrEqual_Impl
	 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#get_lessThanOrEqual_()
	 * @generated
	 */
	int _LESS_THAN_OR_EQUAL_ = 88;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _LESS_THAN_OR_EQUAL___NAME = RELATION__NAME;

	/**
	 * The feature id for the '<em><b>Subtree Interpretations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _LESS_THAN_OR_EQUAL___SUBTREE_INTERPRETATIONS = RELATION__SUBTREE_INTERPRETATIONS;

	/**
	 * The feature id for the '<em><b>Logic Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _LESS_THAN_OR_EQUAL___LOGIC_GROUP = RELATION__LOGIC_GROUP;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _LESS_THAN_OR_EQUAL___P = RELATION__P;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _LESS_THAN_OR_EQUAL___Q = RELATION__Q;

	/**
	 * The feature id for the '<em><b>Interpretation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _LESS_THAN_OR_EQUAL___INTERPRETATION = RELATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _LESS_THAN_OR_EQUAL___DESCRIPTION = RELATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>less Than Or Equal </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _LESS_THAN_OR_EQUAL__FEATURE_COUNT = RELATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>less Than Or Equal </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _LESS_THAN_OR_EQUAL__OPERATION_COUNT = RELATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link comb.expression.metamodel.comb.impl._equal_Impl <em>equal </em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comb.expression.metamodel.comb.impl._equal_Impl
	 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#get_equal_()
	 * @generated
	 */
	int _EQUAL_ = 89;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _EQUAL___NAME = RELATION__NAME;

	/**
	 * The feature id for the '<em><b>Subtree Interpretations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _EQUAL___SUBTREE_INTERPRETATIONS = RELATION__SUBTREE_INTERPRETATIONS;

	/**
	 * The feature id for the '<em><b>Logic Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _EQUAL___LOGIC_GROUP = RELATION__LOGIC_GROUP;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _EQUAL___P = RELATION__P;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _EQUAL___Q = RELATION__Q;

	/**
	 * The feature id for the '<em><b>Interpretation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _EQUAL___INTERPRETATION = RELATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _EQUAL___DESCRIPTION = RELATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>equal </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _EQUAL__FEATURE_COUNT = RELATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>equal </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _EQUAL__OPERATION_COUNT = RELATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link comb.expression.metamodel.comb.impl._greaterThan_Impl <em>greater Than </em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comb.expression.metamodel.comb.impl._greaterThan_Impl
	 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#get_greaterThan_()
	 * @generated
	 */
	int _GREATER_THAN_ = 90;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _GREATER_THAN___NAME = RELATION__NAME;

	/**
	 * The feature id for the '<em><b>Subtree Interpretations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _GREATER_THAN___SUBTREE_INTERPRETATIONS = RELATION__SUBTREE_INTERPRETATIONS;

	/**
	 * The feature id for the '<em><b>Logic Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _GREATER_THAN___LOGIC_GROUP = RELATION__LOGIC_GROUP;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _GREATER_THAN___P = RELATION__P;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _GREATER_THAN___Q = RELATION__Q;

	/**
	 * The feature id for the '<em><b>Interpretation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _GREATER_THAN___INTERPRETATION = RELATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _GREATER_THAN___DESCRIPTION = RELATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>greater Than </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _GREATER_THAN__FEATURE_COUNT = RELATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>greater Than </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _GREATER_THAN__OPERATION_COUNT = RELATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link comb.expression.metamodel.comb.impl._greaterThanOrEqual_Impl <em>greater Than Or Equal </em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comb.expression.metamodel.comb.impl._greaterThanOrEqual_Impl
	 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#get_greaterThanOrEqual_()
	 * @generated
	 */
	int _GREATER_THAN_OR_EQUAL_ = 91;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _GREATER_THAN_OR_EQUAL___NAME = RELATION__NAME;

	/**
	 * The feature id for the '<em><b>Subtree Interpretations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _GREATER_THAN_OR_EQUAL___SUBTREE_INTERPRETATIONS = RELATION__SUBTREE_INTERPRETATIONS;

	/**
	 * The feature id for the '<em><b>Logic Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _GREATER_THAN_OR_EQUAL___LOGIC_GROUP = RELATION__LOGIC_GROUP;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _GREATER_THAN_OR_EQUAL___P = RELATION__P;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _GREATER_THAN_OR_EQUAL___Q = RELATION__Q;

	/**
	 * The feature id for the '<em><b>Interpretation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _GREATER_THAN_OR_EQUAL___INTERPRETATION = RELATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _GREATER_THAN_OR_EQUAL___DESCRIPTION = RELATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>greater Than Or Equal </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _GREATER_THAN_OR_EQUAL__FEATURE_COUNT = RELATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>greater Than Or Equal </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int _GREATER_THAN_OR_EQUAL__OPERATION_COUNT = RELATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link comb.expression.metamodel.comb.LogicGroup <em>Logic Group</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comb.expression.metamodel.comb.LogicGroup
	 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getLogicGroup()
	 * @generated
	 */
	int LOGIC_GROUP = 94;

	/**
	 * The meta object id for the '{@link comb.expression.metamodel.comb.SupportedOutput <em>Supported Output</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comb.expression.metamodel.comb.SupportedOutput
	 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getSupportedOutput()
	 * @generated
	 */
	int SUPPORTED_OUTPUT = 95;

	/**
	 * Returns the meta object for class '{@link comb.expression.metamodel.comb.PrecedenceAfter_until_ <em>Precedence After until </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Precedence After until </em>'.
	 * @see comb.expression.metamodel.comb.PrecedenceAfter_until_
	 * @generated
	 */
	EClass getPrecedenceAfter_until_();

	/**
	 * Returns the meta object for the attribute '{@link comb.expression.metamodel.comb.PrecedenceAfter_until_#getInterpretation <em>Interpretation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interpretation</em>'.
	 * @see comb.expression.metamodel.comb.PrecedenceAfter_until_#getInterpretation()
	 * @see #getPrecedenceAfter_until_()
	 * @generated
	 */
	EAttribute getPrecedenceAfter_until__Interpretation();

	/**
	 * Returns the meta object for the attribute '{@link comb.expression.metamodel.comb.PrecedenceAfter_until_#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see comb.expression.metamodel.comb.PrecedenceAfter_until_#getDescription()
	 * @see #getPrecedenceAfter_until_()
	 * @generated
	 */
	EAttribute getPrecedenceAfter_until__Description();

	/**
	 * Returns the meta object for class '{@link comb.expression.metamodel.comb.AbsenceAfter_until_ <em>Absence After until </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Absence After until </em>'.
	 * @see comb.expression.metamodel.comb.AbsenceAfter_until_
	 * @generated
	 */
	EClass getAbsenceAfter_until_();

	/**
	 * Returns the meta object for the attribute '{@link comb.expression.metamodel.comb.AbsenceAfter_until_#getInterpretation <em>Interpretation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interpretation</em>'.
	 * @see comb.expression.metamodel.comb.AbsenceAfter_until_#getInterpretation()
	 * @see #getAbsenceAfter_until_()
	 * @generated
	 */
	EAttribute getAbsenceAfter_until__Interpretation();

	/**
	 * Returns the meta object for the attribute '{@link comb.expression.metamodel.comb.AbsenceAfter_until_#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see comb.expression.metamodel.comb.AbsenceAfter_until_#getDescription()
	 * @see #getAbsenceAfter_until_()
	 * @generated
	 */
	EAttribute getAbsenceAfter_until__Description();

	/**
	 * Returns the meta object for class '{@link comb.expression.metamodel.comb.Precedence <em>Precedence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Precedence</em>'.
	 * @see comb.expression.metamodel.comb.Precedence
	 * @generated
	 */
	EClass getPrecedence();

	/**
	 * Returns the meta object for class '{@link comb.expression.metamodel.comb._until_ <em>until </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>until </em>'.
	 * @see comb.expression.metamodel.comb._until_
	 * @generated
	 */
	EClass get_until_();

	/**
	 * Returns the meta object for the attribute '{@link comb.expression.metamodel.comb._until_#getInterpretation <em>Interpretation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interpretation</em>'.
	 * @see comb.expression.metamodel.comb._until_#getInterpretation()
	 * @see #get_until_()
	 * @generated
	 */
	EAttribute get_until__Interpretation();

	/**
	 * Returns the meta object for the attribute '{@link comb.expression.metamodel.comb._until_#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see comb.expression.metamodel.comb._until_#getDescription()
	 * @see #get_until_()
	 * @generated
	 */
	EAttribute get_until__Description();

	/**
	 * Returns the meta object for class '{@link comb.expression.metamodel.comb.PrecedenceWithoutParams <em>Precedence Without Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Precedence Without Params</em>'.
	 * @see comb.expression.metamodel.comb.PrecedenceWithoutParams
	 * @generated
	 */
	EClass getPrecedenceWithoutParams();

	/**
	 * Returns the meta object for class '{@link comb.expression.metamodel.comb.LTLOperatorsOneParam <em>LTL Operators One Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LTL Operators One Param</em>'.
	 * @see comb.expression.metamodel.comb.LTLOperatorsOneParam
	 * @generated
	 */
	EClass getLTLOperatorsOneParam();

	/**
	 * Returns the meta object for class '{@link comb.expression.metamodel.comb.UniversalityBefore_ <em>Universality Before </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Universality Before </em>'.
	 * @see comb.expression.metamodel.comb.UniversalityBefore_
	 * @generated
	 */
	EClass getUniversalityBefore_();

	/**
	 * Returns the meta object for the attribute '{@link comb.expression.metamodel.comb.UniversalityBefore_#getInterpretation <em>Interpretation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interpretation</em>'.
	 * @see comb.expression.metamodel.comb.UniversalityBefore_#getInterpretation()
	 * @see #getUniversalityBefore_()
	 * @generated
	 */
	EAttribute getUniversalityBefore__Interpretation();

	/**
	 * Returns the meta object for the attribute '{@link comb.expression.metamodel.comb.UniversalityBefore_#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see comb.expression.metamodel.comb.UniversalityBefore_#getDescription()
	 * @see #getUniversalityBefore_()
	 * @generated
	 */
	EAttribute getUniversalityBefore__Description();

	/**
	 * Returns the meta object for class '{@link comb.expression.metamodel.comb.PrecedenceBefore_ <em>Precedence Before </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Precedence Before </em>'.
	 * @see comb.expression.metamodel.comb.PrecedenceBefore_
	 * @generated
	 */
	EClass getPrecedenceBefore_();

	/**
	 * Returns the meta object for the attribute '{@link comb.expression.metamodel.comb.PrecedenceBefore_#getInterpretation <em>Interpretation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interpretation</em>'.
	 * @see comb.expression.metamodel.comb.PrecedenceBefore_#getInterpretation()
	 * @see #getPrecedenceBefore_()
	 * @generated
	 */
	EAttribute getPrecedenceBefore__Interpretation();

	/**
	 * Returns the meta object for the attribute '{@link comb.expression.metamodel.comb.PrecedenceBefore_#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see comb.expression.metamodel.comb.PrecedenceBefore_#getDescription()
	 * @see #getPrecedenceBefore_()
	 * @generated
	 */
	EAttribute getPrecedenceBefore__Description();

	/**
	 * Returns the meta object for class '{@link comb.expression.metamodel.comb.Absence <em>Absence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Absence</em>'.
	 * @see comb.expression.metamodel.comb.Absence
	 * @generated
	 */
	EClass getAbsence();

	/**
	 * Returns the meta object for class '{@link comb.expression.metamodel.comb.UniversalityAfter_ <em>Universality After </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Universality After </em>'.
	 * @see comb.expression.metamodel.comb.UniversalityAfter_
	 * @generated
	 */
	EClass getUniversalityAfter_();

	/**
	 * Returns the meta object for the attribute '{@link comb.expression.metamodel.comb.UniversalityAfter_#getInterpretation <em>Interpretation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interpretation</em>'.
	 * @see comb.expression.metamodel.comb.UniversalityAfter_#getInterpretation()
	 * @see #getUniversalityAfter_()
	 * @generated
	 */
	EAttribute getUniversalityAfter__Interpretation();

	/**
	 * Returns the meta object for the attribute '{@link comb.expression.metamodel.comb.UniversalityAfter_#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see comb.expression.metamodel.comb.UniversalityAfter_#getDescription()
	 * @see #getUniversalityAfter_()
	 * @generated
	 */
	EAttribute getUniversalityAfter__Description();

	/**
	 * Returns the meta object for class '{@link comb.expression.metamodel.comb.BoundedExistenceAfter_ <em>Bounded Existence After </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bounded Existence After </em>'.
	 * @see comb.expression.metamodel.comb.BoundedExistenceAfter_
	 * @generated
	 */
	EClass getBoundedExistenceAfter_();

	/**
	 * Returns the meta object for the attribute '{@link comb.expression.metamodel.comb.BoundedExistenceAfter_#getInterpretation <em>Interpretation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interpretation</em>'.
	 * @see comb.expression.metamodel.comb.BoundedExistenceAfter_#getInterpretation()
	 * @see #getBoundedExistenceAfter_()
	 * @generated
	 */
	EAttribute getBoundedExistenceAfter__Interpretation();

	/**
	 * Returns the meta object for the attribute '{@link comb.expression.metamodel.comb.BoundedExistenceAfter_#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see comb.expression.metamodel.comb.BoundedExistenceAfter_#getDescription()
	 * @see #getBoundedExistenceAfter_()
	 * @generated
	 */
	EAttribute getBoundedExistenceAfter__Description();

	/**
	 * Returns the meta object for class '{@link comb.expression.metamodel.comb.BoundedExistenceBetween_and_ <em>Bounded Existence Between and </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bounded Existence Between and </em>'.
	 * @see comb.expression.metamodel.comb.BoundedExistenceBetween_and_
	 * @generated
	 */
	EClass getBoundedExistenceBetween_and_();

	/**
	 * Returns the meta object for the attribute '{@link comb.expression.metamodel.comb.BoundedExistenceBetween_and_#getInterpretation <em>Interpretation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interpretation</em>'.
	 * @see comb.expression.metamodel.comb.BoundedExistenceBetween_and_#getInterpretation()
	 * @see #getBoundedExistenceBetween_and_()
	 * @generated
	 */
	EAttribute getBoundedExistenceBetween_and__Interpretation();

	/**
	 * Returns the meta object for the attribute '{@link comb.expression.metamodel.comb.BoundedExistenceBetween_and_#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see comb.expression.metamodel.comb.BoundedExistenceBetween_and_#getDescription()
	 * @see #getBoundedExistenceBetween_and_()
	 * @generated
	 */
	EAttribute getBoundedExistenceBetween_and__Description();

	/**
	 * Returns the meta object for class '{@link comb.expression.metamodel.comb.BoundedExistenceGlobally_ <em>Bounded Existence Globally </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bounded Existence Globally </em>'.
	 * @see comb.expression.metamodel.comb.BoundedExistenceGlobally_
	 * @generated
	 */
	EClass getBoundedExistenceGlobally_();

	/**
	 * Returns the meta object for the attribute '{@link comb.expression.metamodel.comb.BoundedExistenceGlobally_#getInterpretation <em>Interpretation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interpretation</em>'.
	 * @see comb.expression.metamodel.comb.BoundedExistenceGlobally_#getInterpretation()
	 * @see #getBoundedExistenceGlobally_()
	 * @generated
	 */
	EAttribute getBoundedExistenceGlobally__Interpretation();

	/**
	 * Returns the meta object for the attribute '{@link comb.expression.metamodel.comb.BoundedExistenceGlobally_#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see comb.expression.metamodel.comb.BoundedExistenceGlobally_#getDescription()
	 * @see #getBoundedExistenceGlobally_()
	 * @generated
	 */
	EAttribute getBoundedExistenceGlobally__Description();

	/**
	 * Returns the meta object for class '{@link comb.expression.metamodel.comb.AbsenceBefore_ <em>Absence Before </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Absence Before </em>'.
	 * @see comb.expression.metamodel.comb.AbsenceBefore_
	 * @generated
	 */
	EClass getAbsenceBefore_();

	/**
	 * Returns the meta object for the attribute '{@link comb.expression.metamodel.comb.AbsenceBefore_#getInterpretation <em>Interpretation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interpretation</em>'.
	 * @see comb.expression.metamodel.comb.AbsenceBefore_#getInterpretation()
	 * @see #getAbsenceBefore_()
	 * @generated
	 */
	EAttribute getAbsenceBefore__Interpretation();

	/**
	 * Returns the meta object for the attribute '{@link comb.expression.metamodel.comb.AbsenceBefore_#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see comb.expression.metamodel.comb.AbsenceBefore_#getDescription()
	 * @see #getAbsenceBefore_()
	 * @generated
	 */
	EAttribute getAbsenceBefore__Description();

	/**
	 * Returns the meta object for class '{@link comb.expression.metamodel.comb.UniversalityBetween_and_ <em>Universality Between and </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Universality Between and </em>'.
	 * @see comb.expression.metamodel.comb.UniversalityBetween_and_
	 * @generated
	 */
	EClass getUniversalityBetween_and_();

	/**
	 * Returns the meta object for the attribute '{@link comb.expression.metamodel.comb.UniversalityBetween_and_#getInterpretation <em>Interpretation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interpretation</em>'.
	 * @see comb.expression.metamodel.comb.UniversalityBetween_and_#getInterpretation()
	 * @see #getUniversalityBetween_and_()
	 * @generated
	 */
	EAttribute getUniversalityBetween_and__Interpretation();

	/**
	 * Returns the meta object for the attribute '{@link comb.expression.metamodel.comb.UniversalityBetween_and_#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see comb.expression.metamodel.comb.UniversalityBetween_and_#getDescription()
	 * @see #getUniversalityBetween_and_()
	 * @generated
	 */
	EAttribute getUniversalityBetween_and__Description();

	/**
	 * Returns the meta object for class '{@link comb.expression.metamodel.comb.AbsenceTwoParams <em>Absence Two Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Absence Two Params</em>'.
	 * @see comb.expression.metamodel.comb.AbsenceTwoParams
	 * @generated
	 */
	EClass getAbsenceTwoParams();

	/**
	 * Returns the meta object for the containment reference '{@link comb.expression.metamodel.comb.AbsenceTwoParams#getR <em>R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>R</em>'.
	 * @see comb.expression.metamodel.comb.AbsenceTwoParams#getR()
	 * @see #getAbsenceTwoParams()
	 * @generated
	 */
	EReference getAbsenceTwoParams_R();

	/**
	 * Returns the meta object for the containment reference '{@link comb.expression.metamodel.comb.AbsenceTwoParams#getQ <em>Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Q</em>'.
	 * @see comb.expression.metamodel.comb.AbsenceTwoParams#getQ()
	 * @see #getAbsenceTwoParams()
	 * @generated
	 */
	EReference getAbsenceTwoParams_Q();

	/**
	 * Returns the meta object for class '{@link comb.expression.metamodel.comb.ExistenceWithourParams <em>Existence Withour Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Existence Withour Params</em>'.
	 * @see comb.expression.metamodel.comb.ExistenceWithourParams
	 * @generated
	 */
	EClass getExistenceWithourParams();

	/**
	 * Returns the meta object for class '{@link comb.expression.metamodel.comb.BoundedExistneceOneParam <em>Bounded Existnece One Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bounded Existnece One Param</em>'.
	 * @see comb.expression.metamodel.comb.BoundedExistneceOneParam
	 * @generated
	 */
	EClass getBoundedExistneceOneParam();

	/**
	 * Returns the meta object for the containment reference '{@link comb.expression.metamodel.comb.BoundedExistneceOneParam#getQ <em>Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Q</em>'.
	 * @see comb.expression.metamodel.comb.BoundedExistneceOneParam#getQ()
	 * @see #getBoundedExistneceOneParam()
	 * @generated
	 */
	EReference getBoundedExistneceOneParam_Q();

	/**
	 * Returns the meta object for class '{@link comb.expression.metamodel.comb.ResponseAfter_until_ <em>Response After until </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Response After until </em>'.
	 * @see comb.expression.metamodel.comb.ResponseAfter_until_
	 * @generated
	 */
	EClass getResponseAfter_until_();

	/**
	 * Returns the meta object for the attribute '{@link comb.expression.metamodel.comb.ResponseAfter_until_#getInterpretation <em>Interpretation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interpretation</em>'.
	 * @see comb.expression.metamodel.comb.ResponseAfter_until_#getInterpretation()
	 * @see #getResponseAfter_until_()
	 * @generated
	 */
	EAttribute getResponseAfter_until__Interpretation();

	/**
	 * Returns the meta object for the attribute '{@link comb.expression.metamodel.comb.ResponseAfter_until_#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see comb.expression.metamodel.comb.ResponseAfter_until_#getDescription()
	 * @see #getResponseAfter_until_()
	 * @generated
	 */
	EAttribute getResponseAfter_until__Description();

	/**
	 * Returns the meta object for class '{@link comb.expression.metamodel.comb.LTLOperators <em>LTL Operators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LTL Operators</em>'.
	 * @see comb.expression.metamodel.comb.LTLOperators
	 * @generated
	 */
	EClass getLTLOperators();

	/**
	 * Returns the meta object for the containment reference '{@link comb.expression.metamodel.comb.LTLOperators#getP <em>P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>P</em>'.
	 * @see comb.expression.metamodel.comb.LTLOperators#getP()
	 * @see #getLTLOperators()
	 * @generated
	 */
	EReference getLTLOperators_P();

	/**
	 * Returns the meta object for class '{@link comb.expression.metamodel.comb.BooleanOperators <em>Boolean Operators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Operators</em>'.
	 * @see comb.expression.metamodel.comb.BooleanOperators
	 * @generated
	 */
	EClass getBooleanOperators();

	/**
	 * Returns the meta object for class '{@link comb.expression.metamodel.comb.PrecedenceAfter_ <em>Precedence After </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Precedence After </em>'.
	 * @see comb.expression.metamodel.comb.PrecedenceAfter_
	 * @generated
	 */
	EClass getPrecedenceAfter_();

	/**
	 * Returns the meta object for the attribute '{@link comb.expression.metamodel.comb.PrecedenceAfter_#getInterpretation <em>Interpretation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interpretation</em>'.
	 * @see comb.expression.metamodel.comb.PrecedenceAfter_#getInterpretation()
	 * @see #getPrecedenceAfter_()
	 * @generated
	 */
	EAttribute getPrecedenceAfter__Interpretation();

	/**
	 * Returns the meta object for the attribute '{@link comb.expression.metamodel.comb.PrecedenceAfter_#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see comb.expression.metamodel.comb.PrecedenceAfter_#getDescription()
	 * @see #getPrecedenceAfter_()
	 * @generated
	 */
	EAttribute getPrecedenceAfter__Description();

	/**
	 * Returns the meta object for class '{@link comb.expression.metamodel.comb.Always_ <em>Always </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Always </em>'.
	 * @see comb.expression.metamodel.comb.Always_
	 * @generated
	 */
	EClass getAlways_();

	/**
	 * Returns the meta object for the attribute '{@link comb.expression.metamodel.comb.Always_#getInterpretation <em>Interpretation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interpretation</em>'.
	 * @see comb.expression.metamodel.comb.Always_#getInterpretation()
	 * @see #getAlways_()
	 * @generated
	 */
	EAttribute getAlways__Interpretation();

	/**
	 * Returns the meta object for the attribute '{@link comb.expression.metamodel.comb.Always_#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see comb.expression.metamodel.comb.Always_#getDescription()
	 * @see #getAlways_()
	 * @generated
	 */
	EAttribute getAlways__Description();

	/**
	 * Returns the meta object for class '{@link comb.expression.metamodel.comb.AbsenceWithoutParams <em>Absence Without Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Absence Without Params</em>'.
	 * @see comb.expression.metamodel.comb.AbsenceWithoutParams
	 * @generated
	 */
	EClass getAbsenceWithoutParams();

	/**
	 * Returns the meta object for class '{@link comb.expression.metamodel.comb.ResponseBetween_and_ <em>Response Between and </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Response Between and </em>'.
	 * @see comb.expression.metamodel.comb.ResponseBetween_and_
	 * @generated
	 */
	EClass getResponseBetween_and_();

	/**
	 * Returns the meta object for the attribute '{@link comb.expression.metamodel.comb.ResponseBetween_and_#getInterpretation <em>Interpretation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interpretation</em>'.
	 * @see comb.expression.metamodel.comb.ResponseBetween_and_#getInterpretation()
	 * @see #getResponseBetween_and_()
	 * @generated
	 */
	EAttribute getResponseBetween_and__Interpretation();

	/**
	 * Returns the meta object for the attribute '{@link comb.expression.metamodel.comb.ResponseBetween_and_#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see comb.expression.metamodel.comb.ResponseBetween_and_#getDescription()
	 * @see #getResponseBetween_and_()
	 * @generated
	 */
	EAttribute getResponseBetween_and__Description();

	/**
	 * Returns the meta object for class '{@link comb.expression.metamodel.comb.ResponseAfter_ <em>Response After </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Response After </em>'.
	 * @see comb.expression.metamodel.comb.ResponseAfter_
	 * @generated
	 */
	EClass getResponseAfter_();

	/**
	 * Returns the meta object for the attribute '{@link comb.expression.metamodel.comb.ResponseAfter_#getInterpretation <em>Interpretation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interpretation</em>'.
	 * @see comb.expression.metamodel.comb.ResponseAfter_#getInterpretation()
	 * @see #getResponseAfter_()
	 * @generated
	 */
	EAttribute getResponseAfter__Interpretation();

	/**
	 * Returns the meta object for the attribute '{@link comb.expression.metamodel.comb.ResponseAfter_#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see comb.expression.metamodel.comb.ResponseAfter_#getDescription()
	 * @see #getResponseAfter_()
	 * @generated
	 */
	EAttribute getResponseAfter__Description();

	/**
	 * Returns the meta object for class '{@link comb.expression.metamodel.comb.BoundedExistenceWithoutParams <em>Bounded Existence Without Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bounded Existence Without Params</em>'.
	 * @see comb.expression.metamodel.comb.BoundedExistenceWithoutParams
	 * @generated
	 */
	EClass getBoundedExistenceWithoutParams();

	/**
	 * Returns the meta object for class '{@link comb.expression.metamodel.comb.PrecedenceBetween_and_ <em>Precedence Between and </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Precedence Between and </em>'.
	 * @see comb.expression.metamodel.comb.PrecedenceBetween_and_
	 * @generated
	 */
	EClass getPrecedenceBetween_and_();

	/**
	 * Returns the meta object for the attribute '{@link comb.expression.metamodel.comb.PrecedenceBetween_and_#getInterpretation <em>Interpretation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interpretation</em>'.
	 * @see comb.expression.metamodel.comb.PrecedenceBetween_and_#getInterpretation()
	 * @see #getPrecedenceBetween_and_()
	 * @generated
	 */
	EAttribute getPrecedenceBetween_and__Interpretation();

	/**
	 * Returns the meta object for the attribute '{@link comb.expression.metamodel.comb.PrecedenceBetween_and_#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see comb.expression.metamodel.comb.PrecedenceBetween_and_#getDescription()
	 * @see #getPrecedenceBetween_and_()
	 * @generated
	 */
	EAttribute getPrecedenceBetween_and__Description();

	/**
	 * Returns the meta object for class '{@link comb.expression.metamodel.comb.BoundedExistence <em>Bounded Existence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bounded Existence</em>'.
	 * @see comb.expression.metamodel.comb.BoundedExistence
	 * @generated
	 */
	EClass getBoundedExistence();

	/**
	 * Returns the meta object for class '{@link comb.expression.metamodel.comb.Order <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Order</em>'.
	 * @see comb.expression.metamodel.comb.Order
	 * @generated
	 */
	EClass getOrder();

	/**
	 * Returns the meta object for the containment reference '{@link comb.expression.metamodel.comb.Order#getS <em>S</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>S</em>'.
	 * @see comb.expression.metamodel.comb.Order#getS()
	 * @see #getOrder()
	 * @generated
	 */
	EReference getOrder_S();

	/**
	 * Returns the meta object for class '{@link comb.expression.metamodel.comb.ExistenceBetween_and_ <em>Existence Between and </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Existence Between and </em>'.
	 * @see comb.expression.metamodel.comb.ExistenceBetween_and_
	 * @generated
	 */
	EClass getExistenceBetween_and_();

	/**
	 * Returns the meta object for the attribute '{@link comb.expression.metamodel.comb.ExistenceBetween_and_#getInterpretation <em>Interpretation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interpretation</em>'.
	 * @see comb.expression.metamodel.comb.ExistenceBetween_and_#getInterpretation()
	 * @see #getExistenceBetween_and_()
	 * @generated
	 */
	EAttribute getExistenceBetween_and__Interpretation();

	/**
	 * Returns the meta object for the attribute '{@link comb.expression.metamodel.comb.ExistenceBetween_and_#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see comb.expression.metamodel.comb.ExistenceBetween_and_#getDescription()
	 * @see #getExistenceBetween_and_()
	 * @generated
	 */
	EAttribute getExistenceBetween_and__Description();

	/**
	 * Returns the meta object for class '{@link comb.expression.metamodel.comb.ExistenceAfter_until_ <em>Existence After until </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Existence After until </em>'.
	 * @see comb.expression.metamodel.comb.ExistenceAfter_until_
	 * @generated
	 */
	EClass getExistenceAfter_until_();

	/**
	 * Returns the meta object for the attribute '{@link comb.expression.metamodel.comb.ExistenceAfter_until_#getInterpretation <em>Interpretation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interpretation</em>'.
	 * @see comb.expression.metamodel.comb.ExistenceAfter_until_#getInterpretation()
	 * @see #getExistenceAfter_until_()
	 * @generated
	 */
	EAttribute getExistenceAfter_until__Interpretation();

	/**
	 * Returns the meta object for the attribute '{@link comb.expression.metamodel.comb.ExistenceAfter_until_#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see comb.expression.metamodel.comb.ExistenceAfter_until_#getDescription()
	 * @see #getExistenceAfter_until_()
	 * @generated
	 */
	EAttribute getExistenceAfter_until__Description();

	/**
	 * Returns the meta object for class '{@link comb.expression.metamodel.comb.ResponseBefore_ <em>Response Before </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Response Before </em>'.
	 * @see comb.expression.metamodel.comb.ResponseBefore_
	 * @generated
	 */
	EClass getResponseBefore_();

	/**
	 * Returns the meta object for the attribute '{@link comb.expression.metamodel.comb.ResponseBefore_#getInterpretation <em>Interpretation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interpretation</em>'.
	 * @see comb.expression.metamodel.comb.ResponseBefore_#getInterpretation()
	 * @see #getResponseBefore_()
	 * @generated
	 */
	EAttribute getResponseBefore__Interpretation();

	/**
	 * Returns the meta object for the attribute '{@link comb.expression.metamodel.comb.ResponseBefore_#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see comb.expression.metamodel.comb.ResponseBefore_#getDescription()
	 * @see #getResponseBefore_()
	 * @generated
	 */
	EAttribute getResponseBefore__Description();

	/**
	 * Returns the meta object for class '{@link comb.expression.metamodel.comb.UniversalityTwoParams <em>Universality Two Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Universality Two Params</em>'.
	 * @see comb.expression.metamodel.comb.UniversalityTwoParams
	 * @generated
	 */
	EClass getUniversalityTwoParams();

	/**
	 * Returns the meta object for the containment reference '{@link comb.expression.metamodel.comb.UniversalityTwoParams#getQ <em>Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Q</em>'.
	 * @see comb.expression.metamodel.comb.UniversalityTwoParams#getQ()
	 * @see #getUniversalityTwoParams()
	 * @generated
	 */
	EReference getUniversalityTwoParams_Q();

	/**
	 * Returns the meta object for the containment reference '{@link comb.expression.metamodel.comb.UniversalityTwoParams#getR <em>R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>R</em>'.
	 * @see comb.expression.metamodel.comb.UniversalityTwoParams#getR()
	 * @see #getUniversalityTwoParams()
	 * @generated
	 */
	EReference getUniversalityTwoParams_R();

	/**
	 * Returns the meta object for class '{@link comb.expression.metamodel.comb._and_ <em>and </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>and </em>'.
	 * @see comb.expression.metamodel.comb._and_
	 * @generated
	 */
	EClass get_and_();

	/**
	 * Returns the meta object for the attribute '{@link comb.expression.metamodel.comb._and_#getInterpretation <em>Interpretation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interpretation</em>'.
	 * @see comb.expression.metamodel.comb._and_#getInterpretation()
	 * @see #get_and_()
	 * @generated
	 */
	EAttribute get_and__Interpretation();

	/**
	 * Returns the meta object for the attribute '{@link comb.expression.metamodel.comb._and_#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see comb.expression.metamodel.comb._and_#getDescription()
	 * @see #get_and_()
	 * @generated
	 */
	EAttribute get_and__Description();

	/**
	 * Returns the meta object for class '{@link comb.expression.metamodel.comb.AbsenceGlobally_ <em>Absence Globally </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Absence Globally </em>'.
	 * @see comb.expression.metamodel.comb.AbsenceGlobally_
	 * @generated
	 */
	EClass getAbsenceGlobally_();

	/**
	 * Returns the meta object for the attribute '{@link comb.expression.metamodel.comb.AbsenceGlobally_#getInterpretation <em>Interpretation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interpretation</em>'.
	 * @see comb.expression.metamodel.comb.AbsenceGlobally_#getInterpretation()
	 * @see #getAbsenceGlobally_()
	 * @generated
	 */
	EAttribute getAbsenceGlobally__Interpretation();

	/**
	 * Returns the meta object for the attribute '{@link comb.expression.metamodel.comb.AbsenceGlobally_#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see comb.expression.metamodel.comb.AbsenceGlobally_#getDescription()
	 * @see #getAbsenceGlobally_()
	 * @generated
	 */
	EAttribute getAbsenceGlobally__Description();

	/**
	 * Returns the meta object for class '{@link comb.expression.metamodel.comb.AbsenceBetween_and_ <em>Absence Between and </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Absence Between and </em>'.
	 * @see comb.expression.metamodel.comb.AbsenceBetween_and_
	 * @generated
	 */
	EClass getAbsenceBetween_and_();

	/**
	 * Returns the meta object for the attribute '{@link comb.expression.metamodel.comb.AbsenceBetween_and_#getInterpretation <em>Interpretation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interpretation</em>'.
	 * @see comb.expression.metamodel.comb.AbsenceBetween_and_#getInterpretation()
	 * @see #getAbsenceBetween_and_()
	 * @generated
	 */
	EAttribute getAbsenceBetween_and__Interpretation();

	/**
	 * Returns the meta object for the attribute '{@link comb.expression.metamodel.comb.AbsenceBetween_and_#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see comb.expression.metamodel.comb.AbsenceBetween_and_#getDescription()
	 * @see #getAbsenceBetween_and_()
	 * @generated
	 */
	EAttribute getAbsenceBetween_and__Description();

	/**
	 * Returns the meta object for class '{@link comb.expression.metamodel.comb.ExistneceOneParam <em>Existnece One Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Existnece One Param</em>'.
	 * @see comb.expression.metamodel.comb.ExistneceOneParam
	 * @generated
	 */
	EClass getExistneceOneParam();

	/**
	 * Returns the meta object for the containment reference '{@link comb.expression.metamodel.comb.ExistneceOneParam#getQ <em>Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Q</em>'.
	 * @see comb.expression.metamodel.comb.ExistneceOneParam#getQ()
	 * @see #getExistneceOneParam()
	 * @generated
	 */
	EReference getExistneceOneParam_Q();

	/**
	 * Returns the meta object for class '{@link comb.expression.metamodel.comb._or_ <em>or </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>or </em>'.
	 * @see comb.expression.metamodel.comb._or_
	 * @generated
	 */
	EClass get_or_();

	/**
	 * Returns the meta object for the attribute '{@link comb.expression.metamodel.comb._or_#getInterpretation <em>Interpretation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interpretation</em>'.
	 * @see comb.expression.metamodel.comb._or_#getInterpretation()
	 * @see #get_or_()
	 * @generated
	 */
	EAttribute get_or__Interpretation();

	/**
	 * Returns the meta object for the attribute '{@link comb.expression.metamodel.comb._or_#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see comb.expression.metamodel.comb._or_#getDescription()
	 * @see #get_or_()
	 * @generated
	 */
	EAttribute get_or__Description();

	/**
	 * Returns the meta object for class '{@link comb.expression.metamodel.comb.Response <em>Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Response</em>'.
	 * @see comb.expression.metamodel.comb.Response
	 * @generated
	 */
	EClass getResponse();

	/**
	 * Returns the meta object for class '{@link comb.expression.metamodel.comb.BasicElements <em>Basic Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic Elements</em>'.
	 * @see comb.expression.metamodel.comb.BasicElements
	 * @generated
	 */
	EClass getBasicElements();

	/**
	 * Returns the meta object for class '{@link comb.expression.metamodel.comb.UniversalityWithoutParams <em>Universality Without Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Universality Without Params</em>'.
	 * @see comb.expression.metamodel.comb.UniversalityWithoutParams
	 * @generated
	 */
	EClass getUniversalityWithoutParams();

	/**
	 * Returns the meta object for class '{@link comb.expression.metamodel.comb.AbsenceOneParam <em>Absence One Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Absence One Param</em>'.
	 * @see comb.expression.metamodel.comb.AbsenceOneParam
	 * @generated
	 */
	EClass getAbsenceOneParam();

	/**
	 * Returns the meta object for the containment reference '{@link comb.expression.metamodel.comb.AbsenceOneParam#getQ <em>Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Q</em>'.
	 * @see comb.expression.metamodel.comb.AbsenceOneParam#getQ()
	 * @see #getAbsenceOneParam()
	 * @generated
	 */
	EReference getAbsenceOneParam_Q();

	/**
	 * Returns the meta object for class '{@link comb.expression.metamodel.comb.ResponseWithoutParams <em>Response Without Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Response Without Params</em>'.
	 * @see comb.expression.metamodel.comb.ResponseWithoutParams
	 * @generated
	 */
	EClass getResponseWithoutParams();

	/**
	 * Returns the meta object for class '{@link comb.expression.metamodel.comb.BoundedExistenceAfter_until_ <em>Bounded Existence After until </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bounded Existence After until </em>'.
	 * @see comb.expression.metamodel.comb.BoundedExistenceAfter_until_
	 * @generated
	 */
	EClass getBoundedExistenceAfter_until_();

	/**
	 * Returns the meta object for the attribute '{@link comb.expression.metamodel.comb.BoundedExistenceAfter_until_#getInterpretation <em>Interpretation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interpretation</em>'.
	 * @see comb.expression.metamodel.comb.BoundedExistenceAfter_until_#getInterpretation()
	 * @see #getBoundedExistenceAfter_until_()
	 * @generated
	 */
	EAttribute getBoundedExistenceAfter_until__Interpretation();

	/**
	 * Returns the meta object for the attribute '{@link comb.expression.metamodel.comb.BoundedExistenceAfter_until_#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see comb.expression.metamodel.comb.BoundedExistenceAfter_until_#getDescription()
	 * @see #getBoundedExistenceAfter_until_()
	 * @generated
	 */
	EAttribute getBoundedExistenceAfter_until__Description();

	/**
	 * Returns the meta object for class '{@link comb.expression.metamodel.comb.ExistenceAfter_ <em>Existence After </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Existence After </em>'.
	 * @see comb.expression.metamodel.comb.ExistenceAfter_
	 * @generated
	 */
	EClass getExistenceAfter_();

	/**
	 * Returns the meta object for the attribute '{@link comb.expression.metamodel.comb.ExistenceAfter_#getInterpretation <em>Interpretation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interpretation</em>'.
	 * @see comb.expression.metamodel.comb.ExistenceAfter_#getInterpretation()
	 * @see #getExistenceAfter_()
	 * @generated
	 */
	EAttribute getExistenceAfter__Interpretation();

	/**
	 * Returns the meta object for the attribute '{@link comb.expression.metamodel.comb.ExistenceAfter_#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see comb.expression.metamodel.comb.ExistenceAfter_#getDescription()
	 * @see #getExistenceAfter_()
	 * @generated
	 */
	EAttribute getExistenceAfter__Description();

	/**
	 * Returns the meta object for class '{@link comb.expression.metamodel.comb.BooleanOperatorsTwoParams <em>Boolean Operators Two Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Operators Two Params</em>'.
	 * @see comb.expression.metamodel.comb.BooleanOperatorsTwoParams
	 * @generated
	 */
	EClass getBooleanOperatorsTwoParams();

	/**
	 * Returns the meta object for the containment reference '{@link comb.expression.metamodel.comb.BooleanOperatorsTwoParams#getQ <em>Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Q</em>'.
	 * @see comb.expression.metamodel.comb.BooleanOperatorsTwoParams#getQ()
	 * @see #getBooleanOperatorsTwoParams()
	 * @generated
	 */
	EReference getBooleanOperatorsTwoParams_Q();

	/**
	 * Returns the meta object for class '{@link comb.expression.metamodel.comb.BooleanOperatorsOneParam <em>Boolean Operators One Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Operators One Param</em>'.
	 * @see comb.expression.metamodel.comb.BooleanOperatorsOneParam
	 * @generated
	 */
	EClass getBooleanOperatorsOneParam();

	/**
	 * Returns the meta object for class '{@link comb.expression.metamodel.comb.ExistenceTwoParams <em>Existence Two Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Existence Two Params</em>'.
	 * @see comb.expression.metamodel.comb.ExistenceTwoParams
	 * @generated
	 */
	EClass getExistenceTwoParams();

	/**
	 * Returns the meta object for the containment reference '{@link comb.expression.metamodel.comb.ExistenceTwoParams#getR <em>R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>R</em>'.
	 * @see comb.expression.metamodel.comb.ExistenceTwoParams#getR()
	 * @see #getExistenceTwoParams()
	 * @generated
	 */
	EReference getExistenceTwoParams_R();

	/**
	 * Returns the meta object for the containment reference '{@link comb.expression.metamodel.comb.ExistenceTwoParams#getQ <em>Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Q</em>'.
	 * @see comb.expression.metamodel.comb.ExistenceTwoParams#getQ()
	 * @see #getExistenceTwoParams()
	 * @generated
	 */
	EReference getExistenceTwoParams_Q();

	/**
	 * Returns the meta object for class '{@link comb.expression.metamodel.comb.Existence <em>Existence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Existence</em>'.
	 * @see comb.expression.metamodel.comb.Existence
	 * @generated
	 */
	EClass getExistence();

	/**
	 * Returns the meta object for class '{@link comb.expression.metamodel.comb.UniversalityAfter_until_ <em>Universality After until </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Universality After until </em>'.
	 * @see comb.expression.metamodel.comb.UniversalityAfter_until_
	 * @generated
	 */
	EClass getUniversalityAfter_until_();

	/**
	 * Returns the meta object for the attribute '{@link comb.expression.metamodel.comb.UniversalityAfter_until_#getInterpretation <em>Interpretation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interpretation</em>'.
	 * @see comb.expression.metamodel.comb.UniversalityAfter_until_#getInterpretation()
	 * @see #getUniversalityAfter_until_()
	 * @generated
	 */
	EAttribute getUniversalityAfter_until__Interpretation();

	/**
	 * Returns the meta object for the attribute '{@link comb.expression.metamodel.comb.UniversalityAfter_until_#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see comb.expression.metamodel.comb.UniversalityAfter_until_#getDescription()
	 * @see #getUniversalityAfter_until_()
	 * @generated
	 */
	EAttribute getUniversalityAfter_until__Description();

	/**
	 * Returns the meta object for class '{@link comb.expression.metamodel.comb.ResponseGlobally_ <em>Response Globally </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Response Globally </em>'.
	 * @see comb.expression.metamodel.comb.ResponseGlobally_
	 * @generated
	 */
	EClass getResponseGlobally_();

	/**
	 * Returns the meta object for the attribute '{@link comb.expression.metamodel.comb.ResponseGlobally_#getInterpretation <em>Interpretation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interpretation</em>'.
	 * @see comb.expression.metamodel.comb.ResponseGlobally_#getInterpretation()
	 * @see #getResponseGlobally_()
	 * @generated
	 */
	EAttribute getResponseGlobally__Interpretation();

	/**
	 * Returns the meta object for the attribute '{@link comb.expression.metamodel.comb.ResponseGlobally_#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see comb.expression.metamodel.comb.ResponseGlobally_#getDescription()
	 * @see #getResponseGlobally_()
	 * @generated
	 */
	EAttribute getResponseGlobally__Description();

	/**
	 * Returns the meta object for class '{@link comb.expression.metamodel.comb.ExistenceGlobally_ <em>Existence Globally </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Existence Globally </em>'.
	 * @see comb.expression.metamodel.comb.ExistenceGlobally_
	 * @generated
	 */
	EClass getExistenceGlobally_();

	/**
	 * Returns the meta object for the attribute '{@link comb.expression.metamodel.comb.ExistenceGlobally_#getInterpretation <em>Interpretation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interpretation</em>'.
	 * @see comb.expression.metamodel.comb.ExistenceGlobally_#getInterpretation()
	 * @see #getExistenceGlobally_()
	 * @generated
	 */
	EAttribute getExistenceGlobally__Interpretation();

	/**
	 * Returns the meta object for the attribute '{@link comb.expression.metamodel.comb.ExistenceGlobally_#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see comb.expression.metamodel.comb.ExistenceGlobally_#getDescription()
	 * @see #getExistenceGlobally_()
	 * @generated
	 */
	EAttribute getExistenceGlobally__Description();

	/**
	 * Returns the meta object for class '{@link comb.expression.metamodel.comb.BoundedExistenceBefore_ <em>Bounded Existence Before </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bounded Existence Before </em>'.
	 * @see comb.expression.metamodel.comb.BoundedExistenceBefore_
	 * @generated
	 */
	EClass getBoundedExistenceBefore_();

	/**
	 * Returns the meta object for the attribute '{@link comb.expression.metamodel.comb.BoundedExistenceBefore_#getInterpretation <em>Interpretation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interpretation</em>'.
	 * @see comb.expression.metamodel.comb.BoundedExistenceBefore_#getInterpretation()
	 * @see #getBoundedExistenceBefore_()
	 * @generated
	 */
	EAttribute getBoundedExistenceBefore__Interpretation();

	/**
	 * Returns the meta object for the attribute '{@link comb.expression.metamodel.comb.BoundedExistenceBefore_#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see comb.expression.metamodel.comb.BoundedExistenceBefore_#getDescription()
	 * @see #getBoundedExistenceBefore_()
	 * @generated
	 */
	EAttribute getBoundedExistenceBefore__Description();

	/**
	 * Returns the meta object for class '{@link comb.expression.metamodel.comb.Eventually_ <em>Eventually </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eventually </em>'.
	 * @see comb.expression.metamodel.comb.Eventually_
	 * @generated
	 */
	EClass getEventually_();

	/**
	 * Returns the meta object for the attribute '{@link comb.expression.metamodel.comb.Eventually_#getInterpretation <em>Interpretation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interpretation</em>'.
	 * @see comb.expression.metamodel.comb.Eventually_#getInterpretation()
	 * @see #getEventually_()
	 * @generated
	 */
	EAttribute getEventually__Interpretation();

	/**
	 * Returns the meta object for the attribute '{@link comb.expression.metamodel.comb.Eventually_#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see comb.expression.metamodel.comb.Eventually_#getDescription()
	 * @see #getEventually_()
	 * @generated
	 */
	EAttribute getEventually__Description();

	/**
	 * Returns the meta object for class '{@link comb.expression.metamodel.comb._implies_ <em>implies </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>implies </em>'.
	 * @see comb.expression.metamodel.comb._implies_
	 * @generated
	 */
	EClass get_implies_();

	/**
	 * Returns the meta object for the attribute '{@link comb.expression.metamodel.comb._implies_#getInterpretation <em>Interpretation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interpretation</em>'.
	 * @see comb.expression.metamodel.comb._implies_#getInterpretation()
	 * @see #get_implies_()
	 * @generated
	 */
	EAttribute get_implies__Interpretation();

	/**
	 * Returns the meta object for the attribute '{@link comb.expression.metamodel.comb._implies_#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see comb.expression.metamodel.comb._implies_#getDescription()
	 * @see #get_implies_()
	 * @generated
	 */
	EAttribute get_implies__Description();

	/**
	 * Returns the meta object for class '{@link comb.expression.metamodel.comb.UniversalityGlobally_ <em>Universality Globally </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Universality Globally </em>'.
	 * @see comb.expression.metamodel.comb.UniversalityGlobally_
	 * @generated
	 */
	EClass getUniversalityGlobally_();

	/**
	 * Returns the meta object for the attribute '{@link comb.expression.metamodel.comb.UniversalityGlobally_#getInterpretation <em>Interpretation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interpretation</em>'.
	 * @see comb.expression.metamodel.comb.UniversalityGlobally_#getInterpretation()
	 * @see #getUniversalityGlobally_()
	 * @generated
	 */
	EAttribute getUniversalityGlobally__Interpretation();

	/**
	 * Returns the meta object for the attribute '{@link comb.expression.metamodel.comb.UniversalityGlobally_#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see comb.expression.metamodel.comb.UniversalityGlobally_#getDescription()
	 * @see #getUniversalityGlobally_()
	 * @generated
	 */
	EAttribute getUniversalityGlobally__Description();

	/**
	 * Returns the meta object for class '{@link comb.expression.metamodel.comb.PrecedenceTwoParams <em>Precedence Two Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Precedence Two Params</em>'.
	 * @see comb.expression.metamodel.comb.PrecedenceTwoParams
	 * @generated
	 */
	EClass getPrecedenceTwoParams();

	/**
	 * Returns the meta object for the containment reference '{@link comb.expression.metamodel.comb.PrecedenceTwoParams#getQ <em>Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Q</em>'.
	 * @see comb.expression.metamodel.comb.PrecedenceTwoParams#getQ()
	 * @see #getPrecedenceTwoParams()
	 * @generated
	 */
	EReference getPrecedenceTwoParams_Q();

	/**
	 * Returns the meta object for the containment reference '{@link comb.expression.metamodel.comb.PrecedenceTwoParams#getR <em>R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>R</em>'.
	 * @see comb.expression.metamodel.comb.PrecedenceTwoParams#getR()
	 * @see #getPrecedenceTwoParams()
	 * @generated
	 */
	EReference getPrecedenceTwoParams_R();

	/**
	 * Returns the meta object for class '{@link comb.expression.metamodel.comb.AbsenceAfter_ <em>Absence After </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Absence After </em>'.
	 * @see comb.expression.metamodel.comb.AbsenceAfter_
	 * @generated
	 */
	EClass getAbsenceAfter_();

	/**
	 * Returns the meta object for the attribute '{@link comb.expression.metamodel.comb.AbsenceAfter_#getInterpretation <em>Interpretation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interpretation</em>'.
	 * @see comb.expression.metamodel.comb.AbsenceAfter_#getInterpretation()
	 * @see #getAbsenceAfter_()
	 * @generated
	 */
	EAttribute getAbsenceAfter__Interpretation();

	/**
	 * Returns the meta object for the attribute '{@link comb.expression.metamodel.comb.AbsenceAfter_#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see comb.expression.metamodel.comb.AbsenceAfter_#getDescription()
	 * @see #getAbsenceAfter_()
	 * @generated
	 */
	EAttribute getAbsenceAfter__Description();

	/**
	 * Returns the meta object for class '{@link comb.expression.metamodel.comb.Universality <em>Universality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Universality</em>'.
	 * @see comb.expression.metamodel.comb.Universality
	 * @generated
	 */
	EClass getUniversality();

	/**
	 * Returns the meta object for class '{@link comb.expression.metamodel.comb.PrecedenceOneParam <em>Precedence One Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Precedence One Param</em>'.
	 * @see comb.expression.metamodel.comb.PrecedenceOneParam
	 * @generated
	 */
	EClass getPrecedenceOneParam();

	/**
	 * Returns the meta object for the containment reference '{@link comb.expression.metamodel.comb.PrecedenceOneParam#getQ <em>Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Q</em>'.
	 * @see comb.expression.metamodel.comb.PrecedenceOneParam#getQ()
	 * @see #getPrecedenceOneParam()
	 * @generated
	 */
	EReference getPrecedenceOneParam_Q();

	/**
	 * Returns the meta object for class '{@link comb.expression.metamodel.comb.ResponseTwoParams <em>Response Two Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Response Two Params</em>'.
	 * @see comb.expression.metamodel.comb.ResponseTwoParams
	 * @generated
	 */
	EClass getResponseTwoParams();

	/**
	 * Returns the meta object for the containment reference '{@link comb.expression.metamodel.comb.ResponseTwoParams#getQ <em>Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Q</em>'.
	 * @see comb.expression.metamodel.comb.ResponseTwoParams#getQ()
	 * @see #getResponseTwoParams()
	 * @generated
	 */
	EReference getResponseTwoParams_Q();

	/**
	 * Returns the meta object for the containment reference '{@link comb.expression.metamodel.comb.ResponseTwoParams#getR <em>R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>R</em>'.
	 * @see comb.expression.metamodel.comb.ResponseTwoParams#getR()
	 * @see #getResponseTwoParams()
	 * @generated
	 */
	EReference getResponseTwoParams_R();

	/**
	 * Returns the meta object for class '{@link comb.expression.metamodel.comb.ExistenceBefore_ <em>Existence Before </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Existence Before </em>'.
	 * @see comb.expression.metamodel.comb.ExistenceBefore_
	 * @generated
	 */
	EClass getExistenceBefore_();

	/**
	 * Returns the meta object for the attribute '{@link comb.expression.metamodel.comb.ExistenceBefore_#getInterpretation <em>Interpretation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interpretation</em>'.
	 * @see comb.expression.metamodel.comb.ExistenceBefore_#getInterpretation()
	 * @see #getExistenceBefore_()
	 * @generated
	 */
	EAttribute getExistenceBefore__Interpretation();

	/**
	 * Returns the meta object for the attribute '{@link comb.expression.metamodel.comb.ExistenceBefore_#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see comb.expression.metamodel.comb.ExistenceBefore_#getDescription()
	 * @see #getExistenceBefore_()
	 * @generated
	 */
	EAttribute getExistenceBefore__Description();

	/**
	 * Returns the meta object for class '{@link comb.expression.metamodel.comb.Occurrence <em>Occurrence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Occurrence</em>'.
	 * @see comb.expression.metamodel.comb.Occurrence
	 * @generated
	 */
	EClass getOccurrence();

	/**
	 * Returns the meta object for class '{@link comb.expression.metamodel.comb.ResponseOneParam <em>Response One Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Response One Param</em>'.
	 * @see comb.expression.metamodel.comb.ResponseOneParam
	 * @generated
	 */
	EClass getResponseOneParam();

	/**
	 * Returns the meta object for the containment reference '{@link comb.expression.metamodel.comb.ResponseOneParam#getQ <em>Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Q</em>'.
	 * @see comb.expression.metamodel.comb.ResponseOneParam#getQ()
	 * @see #getResponseOneParam()
	 * @generated
	 */
	EReference getResponseOneParam_Q();

	/**
	 * Returns the meta object for class '{@link comb.expression.metamodel.comb.UniversalityOneParam <em>Universality One Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Universality One Param</em>'.
	 * @see comb.expression.metamodel.comb.UniversalityOneParam
	 * @generated
	 */
	EClass getUniversalityOneParam();

	/**
	 * Returns the meta object for the containment reference '{@link comb.expression.metamodel.comb.UniversalityOneParam#getQ <em>Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Q</em>'.
	 * @see comb.expression.metamodel.comb.UniversalityOneParam#getQ()
	 * @see #getUniversalityOneParam()
	 * @generated
	 */
	EReference getUniversalityOneParam_Q();

	/**
	 * Returns the meta object for class '{@link comb.expression.metamodel.comb.PrecedenceGlobally_ <em>Precedence Globally </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Precedence Globally </em>'.
	 * @see comb.expression.metamodel.comb.PrecedenceGlobally_
	 * @generated
	 */
	EClass getPrecedenceGlobally_();

	/**
	 * Returns the meta object for the attribute '{@link comb.expression.metamodel.comb.PrecedenceGlobally_#getInterpretation <em>Interpretation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interpretation</em>'.
	 * @see comb.expression.metamodel.comb.PrecedenceGlobally_#getInterpretation()
	 * @see #getPrecedenceGlobally_()
	 * @generated
	 */
	EAttribute getPrecedenceGlobally__Interpretation();

	/**
	 * Returns the meta object for the attribute '{@link comb.expression.metamodel.comb.PrecedenceGlobally_#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see comb.expression.metamodel.comb.PrecedenceGlobally_#getDescription()
	 * @see #getPrecedenceGlobally_()
	 * @generated
	 */
	EAttribute getPrecedenceGlobally__Description();

	/**
	 * Returns the meta object for class '{@link comb.expression.metamodel.comb.Literal <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal</em>'.
	 * @see comb.expression.metamodel.comb.Literal
	 * @generated
	 */
	EClass getLiteral();

	/**
	 * Returns the meta object for the attribute '{@link comb.expression.metamodel.comb.Literal#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see comb.expression.metamodel.comb.Literal#getDescription()
	 * @see #getLiteral()
	 * @generated
	 */
	EAttribute getLiteral_Description();

	/**
	 * Returns the meta object for class '{@link comb.expression.metamodel.comb.Next_ <em>Next </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Next </em>'.
	 * @see comb.expression.metamodel.comb.Next_
	 * @generated
	 */
	EClass getNext_();

	/**
	 * Returns the meta object for the attribute '{@link comb.expression.metamodel.comb.Next_#getInterpretation <em>Interpretation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interpretation</em>'.
	 * @see comb.expression.metamodel.comb.Next_#getInterpretation()
	 * @see #getNext_()
	 * @generated
	 */
	EAttribute getNext__Interpretation();

	/**
	 * Returns the meta object for the attribute '{@link comb.expression.metamodel.comb.Next_#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see comb.expression.metamodel.comb.Next_#getDescription()
	 * @see #getNext_()
	 * @generated
	 */
	EAttribute getNext__Description();

	/**
	 * Returns the meta object for class '{@link comb.expression.metamodel.comb.BoundedExistenceTwoParams <em>Bounded Existence Two Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bounded Existence Two Params</em>'.
	 * @see comb.expression.metamodel.comb.BoundedExistenceTwoParams
	 * @generated
	 */
	EClass getBoundedExistenceTwoParams();

	/**
	 * Returns the meta object for the containment reference '{@link comb.expression.metamodel.comb.BoundedExistenceTwoParams#getQ <em>Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Q</em>'.
	 * @see comb.expression.metamodel.comb.BoundedExistenceTwoParams#getQ()
	 * @see #getBoundedExistenceTwoParams()
	 * @generated
	 */
	EReference getBoundedExistenceTwoParams_Q();

	/**
	 * Returns the meta object for the containment reference '{@link comb.expression.metamodel.comb.BoundedExistenceTwoParams#getR <em>R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>R</em>'.
	 * @see comb.expression.metamodel.comb.BoundedExistenceTwoParams#getR()
	 * @see #getBoundedExistenceTwoParams()
	 * @generated
	 */
	EReference getBoundedExistenceTwoParams_R();

	/**
	 * Returns the meta object for class '{@link comb.expression.metamodel.comb.Not_ <em>Not </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not </em>'.
	 * @see comb.expression.metamodel.comb.Not_
	 * @generated
	 */
	EClass getNot_();

	/**
	 * Returns the meta object for the attribute '{@link comb.expression.metamodel.comb.Not_#getInterpretation <em>Interpretation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interpretation</em>'.
	 * @see comb.expression.metamodel.comb.Not_#getInterpretation()
	 * @see #getNot_()
	 * @generated
	 */
	EAttribute getNot__Interpretation();

	/**
	 * Returns the meta object for the attribute '{@link comb.expression.metamodel.comb.Not_#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see comb.expression.metamodel.comb.Not_#getDescription()
	 * @see #getNot_()
	 * @generated
	 */
	EAttribute getNot__Description();

	/**
	 * Returns the meta object for class '{@link comb.expression.metamodel.comb.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see comb.expression.metamodel.comb.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the attribute '{@link comb.expression.metamodel.comb.Element#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see comb.expression.metamodel.comb.Element#getName()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Name();

	/**
	 * Returns the meta object for the attribute list '{@link comb.expression.metamodel.comb.Element#getSubtreeInterpretations <em>Subtree Interpretations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Subtree Interpretations</em>'.
	 * @see comb.expression.metamodel.comb.Element#getSubtreeInterpretations()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_SubtreeInterpretations();

	/**
	 * Returns the meta object for the attribute '{@link comb.expression.metamodel.comb.Element#getLogicGroup <em>Logic Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Logic Group</em>'.
	 * @see comb.expression.metamodel.comb.Element#getLogicGroup()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_LogicGroup();

	/**
	 * Returns the meta object for class '{@link comb.expression.metamodel.comb.LTLOperatorsTwoParams <em>LTL Operators Two Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LTL Operators Two Params</em>'.
	 * @see comb.expression.metamodel.comb.LTLOperatorsTwoParams
	 * @generated
	 */
	EClass getLTLOperatorsTwoParams();

	/**
	 * Returns the meta object for the containment reference '{@link comb.expression.metamodel.comb.LTLOperatorsTwoParams#getQ <em>Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Q</em>'.
	 * @see comb.expression.metamodel.comb.LTLOperatorsTwoParams#getQ()
	 * @see #getLTLOperatorsTwoParams()
	 * @generated
	 */
	EReference getLTLOperatorsTwoParams_Q();

	/**
	 * Returns the meta object for class '{@link comb.expression.metamodel.comb.EventuallyWithin_and_ <em>Eventually Within and </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eventually Within and </em>'.
	 * @see comb.expression.metamodel.comb.EventuallyWithin_and_
	 * @generated
	 */
	EClass getEventuallyWithin_and_();

	/**
	 * Returns the meta object for the attribute '{@link comb.expression.metamodel.comb.EventuallyWithin_and_#getInterpretation <em>Interpretation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interpretation</em>'.
	 * @see comb.expression.metamodel.comb.EventuallyWithin_and_#getInterpretation()
	 * @see #getEventuallyWithin_and_()
	 * @generated
	 */
	EAttribute getEventuallyWithin_and__Interpretation();

	/**
	 * Returns the meta object for the attribute '{@link comb.expression.metamodel.comb.EventuallyWithin_and_#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see comb.expression.metamodel.comb.EventuallyWithin_and_#getDescription()
	 * @see #getEventuallyWithin_and_()
	 * @generated
	 */
	EAttribute getEventuallyWithin_and__Description();

	/**
	 * Returns the meta object for the containment reference '{@link comb.expression.metamodel.comb.EventuallyWithin_and_#getL <em>L</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>L</em>'.
	 * @see comb.expression.metamodel.comb.EventuallyWithin_and_#getL()
	 * @see #getEventuallyWithin_and_()
	 * @generated
	 */
	EReference getEventuallyWithin_and__L();

	/**
	 * Returns the meta object for the containment reference '{@link comb.expression.metamodel.comb.EventuallyWithin_and_#getH <em>H</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>H</em>'.
	 * @see comb.expression.metamodel.comb.EventuallyWithin_and_#getH()
	 * @see #getEventuallyWithin_and_()
	 * @generated
	 */
	EReference getEventuallyWithin_and__H();

	/**
	 * Returns the meta object for class '{@link comb.expression.metamodel.comb._untilWithin_and_ <em>until Within and </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>until Within and </em>'.
	 * @see comb.expression.metamodel.comb._untilWithin_and_
	 * @generated
	 */
	EClass get_untilWithin_and_();

	/**
	 * Returns the meta object for the attribute '{@link comb.expression.metamodel.comb._untilWithin_and_#getInterpretation <em>Interpretation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interpretation</em>'.
	 * @see comb.expression.metamodel.comb._untilWithin_and_#getInterpretation()
	 * @see #get_untilWithin_and_()
	 * @generated
	 */
	EAttribute get_untilWithin_and__Interpretation();

	/**
	 * Returns the meta object for the attribute '{@link comb.expression.metamodel.comb._untilWithin_and_#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see comb.expression.metamodel.comb._untilWithin_and_#getDescription()
	 * @see #get_untilWithin_and_()
	 * @generated
	 */
	EAttribute get_untilWithin_and__Description();

	/**
	 * Returns the meta object for the containment reference '{@link comb.expression.metamodel.comb._untilWithin_and_#getL <em>L</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>L</em>'.
	 * @see comb.expression.metamodel.comb._untilWithin_and_#getL()
	 * @see #get_untilWithin_and_()
	 * @generated
	 */
	EReference get_untilWithin_and__L();

	/**
	 * Returns the meta object for the containment reference '{@link comb.expression.metamodel.comb._untilWithin_and_#getH <em>H</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>H</em>'.
	 * @see comb.expression.metamodel.comb._untilWithin_and_#getH()
	 * @see #get_untilWithin_and_()
	 * @generated
	 */
	EReference get_untilWithin_and__H();

	/**
	 * Returns the meta object for class '{@link comb.expression.metamodel.comb.AlwaysWithin_and_ <em>Always Within and </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Always Within and </em>'.
	 * @see comb.expression.metamodel.comb.AlwaysWithin_and_
	 * @generated
	 */
	EClass getAlwaysWithin_and_();

	/**
	 * Returns the meta object for the attribute '{@link comb.expression.metamodel.comb.AlwaysWithin_and_#getInterpretation <em>Interpretation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interpretation</em>'.
	 * @see comb.expression.metamodel.comb.AlwaysWithin_and_#getInterpretation()
	 * @see #getAlwaysWithin_and_()
	 * @generated
	 */
	EAttribute getAlwaysWithin_and__Interpretation();

	/**
	 * Returns the meta object for the attribute '{@link comb.expression.metamodel.comb.AlwaysWithin_and_#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see comb.expression.metamodel.comb.AlwaysWithin_and_#getDescription()
	 * @see #getAlwaysWithin_and_()
	 * @generated
	 */
	EAttribute getAlwaysWithin_and__Description();

	/**
	 * Returns the meta object for the containment reference '{@link comb.expression.metamodel.comb.AlwaysWithin_and_#getL <em>L</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>L</em>'.
	 * @see comb.expression.metamodel.comb.AlwaysWithin_and_#getL()
	 * @see #getAlwaysWithin_and_()
	 * @generated
	 */
	EReference getAlwaysWithin_and__L();

	/**
	 * Returns the meta object for the containment reference '{@link comb.expression.metamodel.comb.AlwaysWithin_and_#getH <em>H</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>H</em>'.
	 * @see comb.expression.metamodel.comb.AlwaysWithin_and_#getH()
	 * @see #getAlwaysWithin_and_()
	 * @generated
	 */
	EReference getAlwaysWithin_and__H();

	/**
	 * Returns the meta object for class '{@link comb.expression.metamodel.comb.MITLOperators <em>MITL Operators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MITL Operators</em>'.
	 * @see comb.expression.metamodel.comb.MITLOperators
	 * @generated
	 */
	EClass getMITLOperators();

	/**
	 * Returns the meta object for the containment reference '{@link comb.expression.metamodel.comb.MITLOperators#getP <em>P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>P</em>'.
	 * @see comb.expression.metamodel.comb.MITLOperators#getP()
	 * @see #getMITLOperators()
	 * @generated
	 */
	EReference getMITLOperators_P();

	/**
	 * Returns the meta object for class '{@link comb.expression.metamodel.comb.MITLOperatorsOneParam <em>MITL Operators One Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MITL Operators One Param</em>'.
	 * @see comb.expression.metamodel.comb.MITLOperatorsOneParam
	 * @generated
	 */
	EClass getMITLOperatorsOneParam();

	/**
	 * Returns the meta object for class '{@link comb.expression.metamodel.comb.MITLOperatorsTwoParams <em>MITL Operators Two Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MITL Operators Two Params</em>'.
	 * @see comb.expression.metamodel.comb.MITLOperatorsTwoParams
	 * @generated
	 */
	EClass getMITLOperatorsTwoParams();

	/**
	 * Returns the meta object for the containment reference '{@link comb.expression.metamodel.comb.MITLOperatorsTwoParams#getQ <em>Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Q</em>'.
	 * @see comb.expression.metamodel.comb.MITLOperatorsTwoParams#getQ()
	 * @see #getMITLOperatorsTwoParams()
	 * @generated
	 */
	EReference getMITLOperatorsTwoParams_Q();

	/**
	 * Returns the meta object for class '{@link comb.expression.metamodel.comb.Comb <em>Comb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comb</em>'.
	 * @see comb.expression.metamodel.comb.Comb
	 * @generated
	 */
	EClass getComb();

	/**
	 * Returns the meta object for the containment reference list '{@link comb.expression.metamodel.comb.Comb#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Element</em>'.
	 * @see comb.expression.metamodel.comb.Comb#getElement()
	 * @see #getComb()
	 * @generated
	 */
	EReference getComb_Element();

	/**
	 * Returns the meta object for class '{@link comb.expression.metamodel.comb.MTLOperators <em>MTL Operators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MTL Operators</em>'.
	 * @see comb.expression.metamodel.comb.MTLOperators
	 * @generated
	 */
	EClass getMTLOperators();

	/**
	 * Returns the meta object for the containment reference '{@link comb.expression.metamodel.comb.MTLOperators#getP <em>P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>P</em>'.
	 * @see comb.expression.metamodel.comb.MTLOperators#getP()
	 * @see #getMTLOperators()
	 * @generated
	 */
	EReference getMTLOperators_P();

	/**
	 * Returns the meta object for class '{@link comb.expression.metamodel.comb.MTLOperatorsOneParam <em>MTL Operators One Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MTL Operators One Param</em>'.
	 * @see comb.expression.metamodel.comb.MTLOperatorsOneParam
	 * @generated
	 */
	EClass getMTLOperatorsOneParam();

	/**
	 * Returns the meta object for class '{@link comb.expression.metamodel.comb.MTLOperatorsTwoParams <em>MTL Operators Two Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MTL Operators Two Params</em>'.
	 * @see comb.expression.metamodel.comb.MTLOperatorsTwoParams
	 * @generated
	 */
	EClass getMTLOperatorsTwoParams();

	/**
	 * Returns the meta object for the containment reference '{@link comb.expression.metamodel.comb.MTLOperatorsTwoParams#getQ <em>Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Q</em>'.
	 * @see comb.expression.metamodel.comb.MTLOperatorsTwoParams#getQ()
	 * @see #getMTLOperatorsTwoParams()
	 * @generated
	 */
	EReference getMTLOperatorsTwoParams_Q();

	/**
	 * Returns the meta object for class '{@link comb.expression.metamodel.comb._untilWithin_ <em>until Within </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>until Within </em>'.
	 * @see comb.expression.metamodel.comb._untilWithin_
	 * @generated
	 */
	EClass get_untilWithin_();

	/**
	 * Returns the meta object for the attribute '{@link comb.expression.metamodel.comb._untilWithin_#getInterpretation <em>Interpretation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interpretation</em>'.
	 * @see comb.expression.metamodel.comb._untilWithin_#getInterpretation()
	 * @see #get_untilWithin_()
	 * @generated
	 */
	EAttribute get_untilWithin__Interpretation();

	/**
	 * Returns the meta object for the attribute '{@link comb.expression.metamodel.comb._untilWithin_#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see comb.expression.metamodel.comb._untilWithin_#getDescription()
	 * @see #get_untilWithin_()
	 * @generated
	 */
	EAttribute get_untilWithin__Description();

	/**
	 * Returns the meta object for the containment reference '{@link comb.expression.metamodel.comb._untilWithin_#getH <em>H</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>H</em>'.
	 * @see comb.expression.metamodel.comb._untilWithin_#getH()
	 * @see #get_untilWithin_()
	 * @generated
	 */
	EReference get_untilWithin__H();

	/**
	 * Returns the meta object for class '{@link comb.expression.metamodel.comb.AlwaysWithin_ <em>Always Within </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Always Within </em>'.
	 * @see comb.expression.metamodel.comb.AlwaysWithin_
	 * @generated
	 */
	EClass getAlwaysWithin_();

	/**
	 * Returns the meta object for the attribute '{@link comb.expression.metamodel.comb.AlwaysWithin_#getInterpretation <em>Interpretation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interpretation</em>'.
	 * @see comb.expression.metamodel.comb.AlwaysWithin_#getInterpretation()
	 * @see #getAlwaysWithin_()
	 * @generated
	 */
	EAttribute getAlwaysWithin__Interpretation();

	/**
	 * Returns the meta object for the attribute '{@link comb.expression.metamodel.comb.AlwaysWithin_#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see comb.expression.metamodel.comb.AlwaysWithin_#getDescription()
	 * @see #getAlwaysWithin_()
	 * @generated
	 */
	EAttribute getAlwaysWithin__Description();

	/**
	 * Returns the meta object for the containment reference '{@link comb.expression.metamodel.comb.AlwaysWithin_#getH <em>H</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>H</em>'.
	 * @see comb.expression.metamodel.comb.AlwaysWithin_#getH()
	 * @see #getAlwaysWithin_()
	 * @generated
	 */
	EReference getAlwaysWithin__H();

	/**
	 * Returns the meta object for class '{@link comb.expression.metamodel.comb.EventuallyWithin_ <em>Eventually Within </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eventually Within </em>'.
	 * @see comb.expression.metamodel.comb.EventuallyWithin_
	 * @generated
	 */
	EClass getEventuallyWithin_();

	/**
	 * Returns the meta object for the attribute '{@link comb.expression.metamodel.comb.EventuallyWithin_#getInterpretation <em>Interpretation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interpretation</em>'.
	 * @see comb.expression.metamodel.comb.EventuallyWithin_#getInterpretation()
	 * @see #getEventuallyWithin_()
	 * @generated
	 */
	EAttribute getEventuallyWithin__Interpretation();

	/**
	 * Returns the meta object for the attribute '{@link comb.expression.metamodel.comb.EventuallyWithin_#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see comb.expression.metamodel.comb.EventuallyWithin_#getDescription()
	 * @see #getEventuallyWithin_()
	 * @generated
	 */
	EAttribute getEventuallyWithin__Description();

	/**
	 * Returns the meta object for the containment reference '{@link comb.expression.metamodel.comb.EventuallyWithin_#getH <em>H</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>H</em>'.
	 * @see comb.expression.metamodel.comb.EventuallyWithin_#getH()
	 * @see #getEventuallyWithin_()
	 * @generated
	 */
	EReference getEventuallyWithin__H();

	/**
	 * Returns the meta object for class '{@link comb.expression.metamodel.comb.Relation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation</em>'.
	 * @see comb.expression.metamodel.comb.Relation
	 * @generated
	 */
	EClass getRelation();

	/**
	 * Returns the meta object for the containment reference '{@link comb.expression.metamodel.comb.Relation#getP <em>P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>P</em>'.
	 * @see comb.expression.metamodel.comb.Relation#getP()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_P();

	/**
	 * Returns the meta object for the containment reference '{@link comb.expression.metamodel.comb.Relation#getQ <em>Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Q</em>'.
	 * @see comb.expression.metamodel.comb.Relation#getQ()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_Q();

	/**
	 * Returns the meta object for class '{@link comb.expression.metamodel.comb._lessThan_ <em>less Than </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>less Than </em>'.
	 * @see comb.expression.metamodel.comb._lessThan_
	 * @generated
	 */
	EClass get_lessThan_();

	/**
	 * Returns the meta object for the attribute '{@link comb.expression.metamodel.comb._lessThan_#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see comb.expression.metamodel.comb._lessThan_#getDescription()
	 * @see #get_lessThan_()
	 * @generated
	 */
	EAttribute get_lessThan__Description();

	/**
	 * Returns the meta object for the attribute '{@link comb.expression.metamodel.comb._lessThan_#getInterpretation <em>Interpretation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interpretation</em>'.
	 * @see comb.expression.metamodel.comb._lessThan_#getInterpretation()
	 * @see #get_lessThan_()
	 * @generated
	 */
	EAttribute get_lessThan__Interpretation();

	/**
	 * Returns the meta object for class '{@link comb.expression.metamodel.comb._lessThanOrEqual_ <em>less Than Or Equal </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>less Than Or Equal </em>'.
	 * @see comb.expression.metamodel.comb._lessThanOrEqual_
	 * @generated
	 */
	EClass get_lessThanOrEqual_();

	/**
	 * Returns the meta object for the attribute '{@link comb.expression.metamodel.comb._lessThanOrEqual_#getInterpretation <em>Interpretation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interpretation</em>'.
	 * @see comb.expression.metamodel.comb._lessThanOrEqual_#getInterpretation()
	 * @see #get_lessThanOrEqual_()
	 * @generated
	 */
	EAttribute get_lessThanOrEqual__Interpretation();

	/**
	 * Returns the meta object for the attribute '{@link comb.expression.metamodel.comb._lessThanOrEqual_#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see comb.expression.metamodel.comb._lessThanOrEqual_#getDescription()
	 * @see #get_lessThanOrEqual_()
	 * @generated
	 */
	EAttribute get_lessThanOrEqual__Description();

	/**
	 * Returns the meta object for class '{@link comb.expression.metamodel.comb._equal_ <em>equal </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>equal </em>'.
	 * @see comb.expression.metamodel.comb._equal_
	 * @generated
	 */
	EClass get_equal_();

	/**
	 * Returns the meta object for the attribute '{@link comb.expression.metamodel.comb._equal_#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see comb.expression.metamodel.comb._equal_#getDescription()
	 * @see #get_equal_()
	 * @generated
	 */
	EAttribute get_equal__Description();

	/**
	 * Returns the meta object for the attribute '{@link comb.expression.metamodel.comb._equal_#getInterpretation <em>Interpretation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interpretation</em>'.
	 * @see comb.expression.metamodel.comb._equal_#getInterpretation()
	 * @see #get_equal_()
	 * @generated
	 */
	EAttribute get_equal__Interpretation();

	/**
	 * Returns the meta object for class '{@link comb.expression.metamodel.comb._greaterThan_ <em>greater Than </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>greater Than </em>'.
	 * @see comb.expression.metamodel.comb._greaterThan_
	 * @generated
	 */
	EClass get_greaterThan_();

	/**
	 * Returns the meta object for the attribute '{@link comb.expression.metamodel.comb._greaterThan_#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see comb.expression.metamodel.comb._greaterThan_#getDescription()
	 * @see #get_greaterThan_()
	 * @generated
	 */
	EAttribute get_greaterThan__Description();

	/**
	 * Returns the meta object for the attribute '{@link comb.expression.metamodel.comb._greaterThan_#getInterpretation <em>Interpretation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interpretation</em>'.
	 * @see comb.expression.metamodel.comb._greaterThan_#getInterpretation()
	 * @see #get_greaterThan_()
	 * @generated
	 */
	EAttribute get_greaterThan__Interpretation();

	/**
	 * Returns the meta object for class '{@link comb.expression.metamodel.comb._greaterThanOrEqual_ <em>greater Than Or Equal </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>greater Than Or Equal </em>'.
	 * @see comb.expression.metamodel.comb._greaterThanOrEqual_
	 * @generated
	 */
	EClass get_greaterThanOrEqual_();

	/**
	 * Returns the meta object for the attribute '{@link comb.expression.metamodel.comb._greaterThanOrEqual_#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see comb.expression.metamodel.comb._greaterThanOrEqual_#getDescription()
	 * @see #get_greaterThanOrEqual_()
	 * @generated
	 */
	EAttribute get_greaterThanOrEqual__Description();

	/**
	 * Returns the meta object for the attribute '{@link comb.expression.metamodel.comb._greaterThanOrEqual_#getInterpretation <em>Interpretation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interpretation</em>'.
	 * @see comb.expression.metamodel.comb._greaterThanOrEqual_#getInterpretation()
	 * @see #get_greaterThanOrEqual_()
	 * @generated
	 */
	EAttribute get_greaterThanOrEqual__Interpretation();

	/**
	 * Returns the meta object for class '{@link comb.expression.metamodel.comb.STLOperators <em>STL Operators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>STL Operators</em>'.
	 * @see comb.expression.metamodel.comb.STLOperators
	 * @generated
	 */
	EClass getSTLOperators();

	/**
	 * Returns the meta object for class '{@link comb.expression.metamodel.comb.LTLPatternMappings <em>LTL Pattern Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LTL Pattern Mappings</em>'.
	 * @see comb.expression.metamodel.comb.LTLPatternMappings
	 * @generated
	 */
	EClass getLTLPatternMappings();

	/**
	 * Returns the meta object for enum '{@link comb.expression.metamodel.comb.LogicGroup <em>Logic Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Logic Group</em>'.
	 * @see comb.expression.metamodel.comb.LogicGroup
	 * @generated
	 */
	EEnum getLogicGroup();

	/**
	 * Returns the meta object for enum '{@link comb.expression.metamodel.comb.SupportedOutput <em>Supported Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Supported Output</em>'.
	 * @see comb.expression.metamodel.comb.SupportedOutput
	 * @generated
	 */
	EEnum getSupportedOutput();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CombFactory getCombFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link comb.expression.metamodel.comb.impl.PrecedenceAfter_until_Impl <em>Precedence After until </em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comb.expression.metamodel.comb.impl.PrecedenceAfter_until_Impl
		 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getPrecedenceAfter_until_()
		 * @generated
		 */
		EClass PRECEDENCE_AFTER_UNTIL_ = eINSTANCE.getPrecedenceAfter_until_();

		/**
		 * The meta object literal for the '<em><b>Interpretation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRECEDENCE_AFTER_UNTIL___INTERPRETATION = eINSTANCE.getPrecedenceAfter_until__Interpretation();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRECEDENCE_AFTER_UNTIL___DESCRIPTION = eINSTANCE.getPrecedenceAfter_until__Description();

		/**
		 * The meta object literal for the '{@link comb.expression.metamodel.comb.impl.AbsenceAfter_until_Impl <em>Absence After until </em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comb.expression.metamodel.comb.impl.AbsenceAfter_until_Impl
		 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getAbsenceAfter_until_()
		 * @generated
		 */
		EClass ABSENCE_AFTER_UNTIL_ = eINSTANCE.getAbsenceAfter_until_();

		/**
		 * The meta object literal for the '<em><b>Interpretation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSENCE_AFTER_UNTIL___INTERPRETATION = eINSTANCE.getAbsenceAfter_until__Interpretation();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSENCE_AFTER_UNTIL___DESCRIPTION = eINSTANCE.getAbsenceAfter_until__Description();

		/**
		 * The meta object literal for the '{@link comb.expression.metamodel.comb.impl.PrecedenceImpl <em>Precedence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comb.expression.metamodel.comb.impl.PrecedenceImpl
		 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getPrecedence()
		 * @generated
		 */
		EClass PRECEDENCE = eINSTANCE.getPrecedence();

		/**
		 * The meta object literal for the '{@link comb.expression.metamodel.comb.impl._until_Impl <em>until </em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comb.expression.metamodel.comb.impl._until_Impl
		 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#get_until_()
		 * @generated
		 */
		EClass _UNTIL_ = eINSTANCE.get_until_();

		/**
		 * The meta object literal for the '<em><b>Interpretation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute _UNTIL___INTERPRETATION = eINSTANCE.get_until__Interpretation();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute _UNTIL___DESCRIPTION = eINSTANCE.get_until__Description();

		/**
		 * The meta object literal for the '{@link comb.expression.metamodel.comb.impl.PrecedenceWithoutParamsImpl <em>Precedence Without Params</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comb.expression.metamodel.comb.impl.PrecedenceWithoutParamsImpl
		 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getPrecedenceWithoutParams()
		 * @generated
		 */
		EClass PRECEDENCE_WITHOUT_PARAMS = eINSTANCE.getPrecedenceWithoutParams();

		/**
		 * The meta object literal for the '{@link comb.expression.metamodel.comb.impl.LTLOperatorsOneParamImpl <em>LTL Operators One Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comb.expression.metamodel.comb.impl.LTLOperatorsOneParamImpl
		 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getLTLOperatorsOneParam()
		 * @generated
		 */
		EClass LTL_OPERATORS_ONE_PARAM = eINSTANCE.getLTLOperatorsOneParam();

		/**
		 * The meta object literal for the '{@link comb.expression.metamodel.comb.impl.UniversalityBefore_Impl <em>Universality Before </em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comb.expression.metamodel.comb.impl.UniversalityBefore_Impl
		 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getUniversalityBefore_()
		 * @generated
		 */
		EClass UNIVERSALITY_BEFORE_ = eINSTANCE.getUniversalityBefore_();

		/**
		 * The meta object literal for the '<em><b>Interpretation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIVERSALITY_BEFORE___INTERPRETATION = eINSTANCE.getUniversalityBefore__Interpretation();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIVERSALITY_BEFORE___DESCRIPTION = eINSTANCE.getUniversalityBefore__Description();

		/**
		 * The meta object literal for the '{@link comb.expression.metamodel.comb.impl.PrecedenceBefore_Impl <em>Precedence Before </em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comb.expression.metamodel.comb.impl.PrecedenceBefore_Impl
		 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getPrecedenceBefore_()
		 * @generated
		 */
		EClass PRECEDENCE_BEFORE_ = eINSTANCE.getPrecedenceBefore_();

		/**
		 * The meta object literal for the '<em><b>Interpretation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRECEDENCE_BEFORE___INTERPRETATION = eINSTANCE.getPrecedenceBefore__Interpretation();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRECEDENCE_BEFORE___DESCRIPTION = eINSTANCE.getPrecedenceBefore__Description();

		/**
		 * The meta object literal for the '{@link comb.expression.metamodel.comb.impl.AbsenceImpl <em>Absence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comb.expression.metamodel.comb.impl.AbsenceImpl
		 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getAbsence()
		 * @generated
		 */
		EClass ABSENCE = eINSTANCE.getAbsence();

		/**
		 * The meta object literal for the '{@link comb.expression.metamodel.comb.impl.UniversalityAfter_Impl <em>Universality After </em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comb.expression.metamodel.comb.impl.UniversalityAfter_Impl
		 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getUniversalityAfter_()
		 * @generated
		 */
		EClass UNIVERSALITY_AFTER_ = eINSTANCE.getUniversalityAfter_();

		/**
		 * The meta object literal for the '<em><b>Interpretation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIVERSALITY_AFTER___INTERPRETATION = eINSTANCE.getUniversalityAfter__Interpretation();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIVERSALITY_AFTER___DESCRIPTION = eINSTANCE.getUniversalityAfter__Description();

		/**
		 * The meta object literal for the '{@link comb.expression.metamodel.comb.impl.BoundedExistenceAfter_Impl <em>Bounded Existence After </em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comb.expression.metamodel.comb.impl.BoundedExistenceAfter_Impl
		 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getBoundedExistenceAfter_()
		 * @generated
		 */
		EClass BOUNDED_EXISTENCE_AFTER_ = eINSTANCE.getBoundedExistenceAfter_();

		/**
		 * The meta object literal for the '<em><b>Interpretation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUNDED_EXISTENCE_AFTER___INTERPRETATION = eINSTANCE.getBoundedExistenceAfter__Interpretation();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUNDED_EXISTENCE_AFTER___DESCRIPTION = eINSTANCE.getBoundedExistenceAfter__Description();

		/**
		 * The meta object literal for the '{@link comb.expression.metamodel.comb.impl.BoundedExistenceBetween_and_Impl <em>Bounded Existence Between and </em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comb.expression.metamodel.comb.impl.BoundedExistenceBetween_and_Impl
		 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getBoundedExistenceBetween_and_()
		 * @generated
		 */
		EClass BOUNDED_EXISTENCE_BETWEEN_AND_ = eINSTANCE.getBoundedExistenceBetween_and_();

		/**
		 * The meta object literal for the '<em><b>Interpretation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUNDED_EXISTENCE_BETWEEN_AND___INTERPRETATION = eINSTANCE
				.getBoundedExistenceBetween_and__Interpretation();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUNDED_EXISTENCE_BETWEEN_AND___DESCRIPTION = eINSTANCE
				.getBoundedExistenceBetween_and__Description();

		/**
		 * The meta object literal for the '{@link comb.expression.metamodel.comb.impl.BoundedExistenceGlobally_Impl <em>Bounded Existence Globally </em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comb.expression.metamodel.comb.impl.BoundedExistenceGlobally_Impl
		 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getBoundedExistenceGlobally_()
		 * @generated
		 */
		EClass BOUNDED_EXISTENCE_GLOBALLY_ = eINSTANCE.getBoundedExistenceGlobally_();

		/**
		 * The meta object literal for the '<em><b>Interpretation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUNDED_EXISTENCE_GLOBALLY___INTERPRETATION = eINSTANCE
				.getBoundedExistenceGlobally__Interpretation();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUNDED_EXISTENCE_GLOBALLY___DESCRIPTION = eINSTANCE.getBoundedExistenceGlobally__Description();

		/**
		 * The meta object literal for the '{@link comb.expression.metamodel.comb.impl.AbsenceBefore_Impl <em>Absence Before </em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comb.expression.metamodel.comb.impl.AbsenceBefore_Impl
		 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getAbsenceBefore_()
		 * @generated
		 */
		EClass ABSENCE_BEFORE_ = eINSTANCE.getAbsenceBefore_();

		/**
		 * The meta object literal for the '<em><b>Interpretation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSENCE_BEFORE___INTERPRETATION = eINSTANCE.getAbsenceBefore__Interpretation();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSENCE_BEFORE___DESCRIPTION = eINSTANCE.getAbsenceBefore__Description();

		/**
		 * The meta object literal for the '{@link comb.expression.metamodel.comb.impl.UniversalityBetween_and_Impl <em>Universality Between and </em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comb.expression.metamodel.comb.impl.UniversalityBetween_and_Impl
		 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getUniversalityBetween_and_()
		 * @generated
		 */
		EClass UNIVERSALITY_BETWEEN_AND_ = eINSTANCE.getUniversalityBetween_and_();

		/**
		 * The meta object literal for the '<em><b>Interpretation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIVERSALITY_BETWEEN_AND___INTERPRETATION = eINSTANCE.getUniversalityBetween_and__Interpretation();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIVERSALITY_BETWEEN_AND___DESCRIPTION = eINSTANCE.getUniversalityBetween_and__Description();

		/**
		 * The meta object literal for the '{@link comb.expression.metamodel.comb.impl.AbsenceTwoParamsImpl <em>Absence Two Params</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comb.expression.metamodel.comb.impl.AbsenceTwoParamsImpl
		 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getAbsenceTwoParams()
		 * @generated
		 */
		EClass ABSENCE_TWO_PARAMS = eINSTANCE.getAbsenceTwoParams();

		/**
		 * The meta object literal for the '<em><b>R</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSENCE_TWO_PARAMS__R = eINSTANCE.getAbsenceTwoParams_R();

		/**
		 * The meta object literal for the '<em><b>Q</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSENCE_TWO_PARAMS__Q = eINSTANCE.getAbsenceTwoParams_Q();

		/**
		 * The meta object literal for the '{@link comb.expression.metamodel.comb.impl.ExistenceWithourParamsImpl <em>Existence Withour Params</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comb.expression.metamodel.comb.impl.ExistenceWithourParamsImpl
		 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getExistenceWithourParams()
		 * @generated
		 */
		EClass EXISTENCE_WITHOUR_PARAMS = eINSTANCE.getExistenceWithourParams();

		/**
		 * The meta object literal for the '{@link comb.expression.metamodel.comb.impl.BoundedExistneceOneParamImpl <em>Bounded Existnece One Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comb.expression.metamodel.comb.impl.BoundedExistneceOneParamImpl
		 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getBoundedExistneceOneParam()
		 * @generated
		 */
		EClass BOUNDED_EXISTNECE_ONE_PARAM = eINSTANCE.getBoundedExistneceOneParam();

		/**
		 * The meta object literal for the '<em><b>Q</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOUNDED_EXISTNECE_ONE_PARAM__Q = eINSTANCE.getBoundedExistneceOneParam_Q();

		/**
		 * The meta object literal for the '{@link comb.expression.metamodel.comb.impl.ResponseAfter_until_Impl <em>Response After until </em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comb.expression.metamodel.comb.impl.ResponseAfter_until_Impl
		 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getResponseAfter_until_()
		 * @generated
		 */
		EClass RESPONSE_AFTER_UNTIL_ = eINSTANCE.getResponseAfter_until_();

		/**
		 * The meta object literal for the '<em><b>Interpretation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSE_AFTER_UNTIL___INTERPRETATION = eINSTANCE.getResponseAfter_until__Interpretation();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSE_AFTER_UNTIL___DESCRIPTION = eINSTANCE.getResponseAfter_until__Description();

		/**
		 * The meta object literal for the '{@link comb.expression.metamodel.comb.impl.LTLOperatorsImpl <em>LTL Operators</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comb.expression.metamodel.comb.impl.LTLOperatorsImpl
		 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getLTLOperators()
		 * @generated
		 */
		EClass LTL_OPERATORS = eINSTANCE.getLTLOperators();

		/**
		 * The meta object literal for the '<em><b>P</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LTL_OPERATORS__P = eINSTANCE.getLTLOperators_P();

		/**
		 * The meta object literal for the '{@link comb.expression.metamodel.comb.impl.BooleanOperatorsImpl <em>Boolean Operators</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comb.expression.metamodel.comb.impl.BooleanOperatorsImpl
		 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getBooleanOperators()
		 * @generated
		 */
		EClass BOOLEAN_OPERATORS = eINSTANCE.getBooleanOperators();

		/**
		 * The meta object literal for the '{@link comb.expression.metamodel.comb.impl.PrecedenceAfter_Impl <em>Precedence After </em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comb.expression.metamodel.comb.impl.PrecedenceAfter_Impl
		 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getPrecedenceAfter_()
		 * @generated
		 */
		EClass PRECEDENCE_AFTER_ = eINSTANCE.getPrecedenceAfter_();

		/**
		 * The meta object literal for the '<em><b>Interpretation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRECEDENCE_AFTER___INTERPRETATION = eINSTANCE.getPrecedenceAfter__Interpretation();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRECEDENCE_AFTER___DESCRIPTION = eINSTANCE.getPrecedenceAfter__Description();

		/**
		 * The meta object literal for the '{@link comb.expression.metamodel.comb.impl.Always_Impl <em>Always </em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comb.expression.metamodel.comb.impl.Always_Impl
		 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getAlways_()
		 * @generated
		 */
		EClass ALWAYS_ = eINSTANCE.getAlways_();

		/**
		 * The meta object literal for the '<em><b>Interpretation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALWAYS___INTERPRETATION = eINSTANCE.getAlways__Interpretation();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALWAYS___DESCRIPTION = eINSTANCE.getAlways__Description();

		/**
		 * The meta object literal for the '{@link comb.expression.metamodel.comb.impl.AbsenceWithoutParamsImpl <em>Absence Without Params</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comb.expression.metamodel.comb.impl.AbsenceWithoutParamsImpl
		 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getAbsenceWithoutParams()
		 * @generated
		 */
		EClass ABSENCE_WITHOUT_PARAMS = eINSTANCE.getAbsenceWithoutParams();

		/**
		 * The meta object literal for the '{@link comb.expression.metamodel.comb.impl.ResponseBetween_and_Impl <em>Response Between and </em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comb.expression.metamodel.comb.impl.ResponseBetween_and_Impl
		 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getResponseBetween_and_()
		 * @generated
		 */
		EClass RESPONSE_BETWEEN_AND_ = eINSTANCE.getResponseBetween_and_();

		/**
		 * The meta object literal for the '<em><b>Interpretation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSE_BETWEEN_AND___INTERPRETATION = eINSTANCE.getResponseBetween_and__Interpretation();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSE_BETWEEN_AND___DESCRIPTION = eINSTANCE.getResponseBetween_and__Description();

		/**
		 * The meta object literal for the '{@link comb.expression.metamodel.comb.impl.ResponseAfter_Impl <em>Response After </em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comb.expression.metamodel.comb.impl.ResponseAfter_Impl
		 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getResponseAfter_()
		 * @generated
		 */
		EClass RESPONSE_AFTER_ = eINSTANCE.getResponseAfter_();

		/**
		 * The meta object literal for the '<em><b>Interpretation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSE_AFTER___INTERPRETATION = eINSTANCE.getResponseAfter__Interpretation();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSE_AFTER___DESCRIPTION = eINSTANCE.getResponseAfter__Description();

		/**
		 * The meta object literal for the '{@link comb.expression.metamodel.comb.impl.BoundedExistenceWithoutParamsImpl <em>Bounded Existence Without Params</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comb.expression.metamodel.comb.impl.BoundedExistenceWithoutParamsImpl
		 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getBoundedExistenceWithoutParams()
		 * @generated
		 */
		EClass BOUNDED_EXISTENCE_WITHOUT_PARAMS = eINSTANCE.getBoundedExistenceWithoutParams();

		/**
		 * The meta object literal for the '{@link comb.expression.metamodel.comb.impl.PrecedenceBetween_and_Impl <em>Precedence Between and </em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comb.expression.metamodel.comb.impl.PrecedenceBetween_and_Impl
		 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getPrecedenceBetween_and_()
		 * @generated
		 */
		EClass PRECEDENCE_BETWEEN_AND_ = eINSTANCE.getPrecedenceBetween_and_();

		/**
		 * The meta object literal for the '<em><b>Interpretation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRECEDENCE_BETWEEN_AND___INTERPRETATION = eINSTANCE.getPrecedenceBetween_and__Interpretation();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRECEDENCE_BETWEEN_AND___DESCRIPTION = eINSTANCE.getPrecedenceBetween_and__Description();

		/**
		 * The meta object literal for the '{@link comb.expression.metamodel.comb.impl.BoundedExistenceImpl <em>Bounded Existence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comb.expression.metamodel.comb.impl.BoundedExistenceImpl
		 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getBoundedExistence()
		 * @generated
		 */
		EClass BOUNDED_EXISTENCE = eINSTANCE.getBoundedExistence();

		/**
		 * The meta object literal for the '{@link comb.expression.metamodel.comb.impl.OrderImpl <em>Order</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comb.expression.metamodel.comb.impl.OrderImpl
		 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getOrder()
		 * @generated
		 */
		EClass ORDER = eINSTANCE.getOrder();

		/**
		 * The meta object literal for the '<em><b>S</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER__S = eINSTANCE.getOrder_S();

		/**
		 * The meta object literal for the '{@link comb.expression.metamodel.comb.impl.ExistenceBetween_and_Impl <em>Existence Between and </em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comb.expression.metamodel.comb.impl.ExistenceBetween_and_Impl
		 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getExistenceBetween_and_()
		 * @generated
		 */
		EClass EXISTENCE_BETWEEN_AND_ = eINSTANCE.getExistenceBetween_and_();

		/**
		 * The meta object literal for the '<em><b>Interpretation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXISTENCE_BETWEEN_AND___INTERPRETATION = eINSTANCE.getExistenceBetween_and__Interpretation();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXISTENCE_BETWEEN_AND___DESCRIPTION = eINSTANCE.getExistenceBetween_and__Description();

		/**
		 * The meta object literal for the '{@link comb.expression.metamodel.comb.impl.ExistenceAfter_until_Impl <em>Existence After until </em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comb.expression.metamodel.comb.impl.ExistenceAfter_until_Impl
		 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getExistenceAfter_until_()
		 * @generated
		 */
		EClass EXISTENCE_AFTER_UNTIL_ = eINSTANCE.getExistenceAfter_until_();

		/**
		 * The meta object literal for the '<em><b>Interpretation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXISTENCE_AFTER_UNTIL___INTERPRETATION = eINSTANCE.getExistenceAfter_until__Interpretation();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXISTENCE_AFTER_UNTIL___DESCRIPTION = eINSTANCE.getExistenceAfter_until__Description();

		/**
		 * The meta object literal for the '{@link comb.expression.metamodel.comb.impl.ResponseBefore_Impl <em>Response Before </em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comb.expression.metamodel.comb.impl.ResponseBefore_Impl
		 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getResponseBefore_()
		 * @generated
		 */
		EClass RESPONSE_BEFORE_ = eINSTANCE.getResponseBefore_();

		/**
		 * The meta object literal for the '<em><b>Interpretation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSE_BEFORE___INTERPRETATION = eINSTANCE.getResponseBefore__Interpretation();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSE_BEFORE___DESCRIPTION = eINSTANCE.getResponseBefore__Description();

		/**
		 * The meta object literal for the '{@link comb.expression.metamodel.comb.impl.UniversalityTwoParamsImpl <em>Universality Two Params</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comb.expression.metamodel.comb.impl.UniversalityTwoParamsImpl
		 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getUniversalityTwoParams()
		 * @generated
		 */
		EClass UNIVERSALITY_TWO_PARAMS = eINSTANCE.getUniversalityTwoParams();

		/**
		 * The meta object literal for the '<em><b>Q</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIVERSALITY_TWO_PARAMS__Q = eINSTANCE.getUniversalityTwoParams_Q();

		/**
		 * The meta object literal for the '<em><b>R</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIVERSALITY_TWO_PARAMS__R = eINSTANCE.getUniversalityTwoParams_R();

		/**
		 * The meta object literal for the '{@link comb.expression.metamodel.comb.impl._and_Impl <em>and </em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comb.expression.metamodel.comb.impl._and_Impl
		 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#get_and_()
		 * @generated
		 */
		EClass _AND_ = eINSTANCE.get_and_();

		/**
		 * The meta object literal for the '<em><b>Interpretation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute _AND___INTERPRETATION = eINSTANCE.get_and__Interpretation();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute _AND___DESCRIPTION = eINSTANCE.get_and__Description();

		/**
		 * The meta object literal for the '{@link comb.expression.metamodel.comb.impl.AbsenceGlobally_Impl <em>Absence Globally </em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comb.expression.metamodel.comb.impl.AbsenceGlobally_Impl
		 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getAbsenceGlobally_()
		 * @generated
		 */
		EClass ABSENCE_GLOBALLY_ = eINSTANCE.getAbsenceGlobally_();

		/**
		 * The meta object literal for the '<em><b>Interpretation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSENCE_GLOBALLY___INTERPRETATION = eINSTANCE.getAbsenceGlobally__Interpretation();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSENCE_GLOBALLY___DESCRIPTION = eINSTANCE.getAbsenceGlobally__Description();

		/**
		 * The meta object literal for the '{@link comb.expression.metamodel.comb.impl.AbsenceBetween_and_Impl <em>Absence Between and </em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comb.expression.metamodel.comb.impl.AbsenceBetween_and_Impl
		 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getAbsenceBetween_and_()
		 * @generated
		 */
		EClass ABSENCE_BETWEEN_AND_ = eINSTANCE.getAbsenceBetween_and_();

		/**
		 * The meta object literal for the '<em><b>Interpretation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSENCE_BETWEEN_AND___INTERPRETATION = eINSTANCE.getAbsenceBetween_and__Interpretation();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSENCE_BETWEEN_AND___DESCRIPTION = eINSTANCE.getAbsenceBetween_and__Description();

		/**
		 * The meta object literal for the '{@link comb.expression.metamodel.comb.impl.ExistneceOneParamImpl <em>Existnece One Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comb.expression.metamodel.comb.impl.ExistneceOneParamImpl
		 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getExistneceOneParam()
		 * @generated
		 */
		EClass EXISTNECE_ONE_PARAM = eINSTANCE.getExistneceOneParam();

		/**
		 * The meta object literal for the '<em><b>Q</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXISTNECE_ONE_PARAM__Q = eINSTANCE.getExistneceOneParam_Q();

		/**
		 * The meta object literal for the '{@link comb.expression.metamodel.comb.impl._or_Impl <em>or </em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comb.expression.metamodel.comb.impl._or_Impl
		 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#get_or_()
		 * @generated
		 */
		EClass _OR_ = eINSTANCE.get_or_();

		/**
		 * The meta object literal for the '<em><b>Interpretation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute _OR___INTERPRETATION = eINSTANCE.get_or__Interpretation();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute _OR___DESCRIPTION = eINSTANCE.get_or__Description();

		/**
		 * The meta object literal for the '{@link comb.expression.metamodel.comb.impl.ResponseImpl <em>Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comb.expression.metamodel.comb.impl.ResponseImpl
		 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getResponse()
		 * @generated
		 */
		EClass RESPONSE = eINSTANCE.getResponse();

		/**
		 * The meta object literal for the '{@link comb.expression.metamodel.comb.impl.BasicElementsImpl <em>Basic Elements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comb.expression.metamodel.comb.impl.BasicElementsImpl
		 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getBasicElements()
		 * @generated
		 */
		EClass BASIC_ELEMENTS = eINSTANCE.getBasicElements();

		/**
		 * The meta object literal for the '{@link comb.expression.metamodel.comb.impl.UniversalityWithoutParamsImpl <em>Universality Without Params</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comb.expression.metamodel.comb.impl.UniversalityWithoutParamsImpl
		 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getUniversalityWithoutParams()
		 * @generated
		 */
		EClass UNIVERSALITY_WITHOUT_PARAMS = eINSTANCE.getUniversalityWithoutParams();

		/**
		 * The meta object literal for the '{@link comb.expression.metamodel.comb.impl.AbsenceOneParamImpl <em>Absence One Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comb.expression.metamodel.comb.impl.AbsenceOneParamImpl
		 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getAbsenceOneParam()
		 * @generated
		 */
		EClass ABSENCE_ONE_PARAM = eINSTANCE.getAbsenceOneParam();

		/**
		 * The meta object literal for the '<em><b>Q</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSENCE_ONE_PARAM__Q = eINSTANCE.getAbsenceOneParam_Q();

		/**
		 * The meta object literal for the '{@link comb.expression.metamodel.comb.impl.ResponseWithoutParamsImpl <em>Response Without Params</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comb.expression.metamodel.comb.impl.ResponseWithoutParamsImpl
		 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getResponseWithoutParams()
		 * @generated
		 */
		EClass RESPONSE_WITHOUT_PARAMS = eINSTANCE.getResponseWithoutParams();

		/**
		 * The meta object literal for the '{@link comb.expression.metamodel.comb.impl.BoundedExistenceAfter_until_Impl <em>Bounded Existence After until </em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comb.expression.metamodel.comb.impl.BoundedExistenceAfter_until_Impl
		 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getBoundedExistenceAfter_until_()
		 * @generated
		 */
		EClass BOUNDED_EXISTENCE_AFTER_UNTIL_ = eINSTANCE.getBoundedExistenceAfter_until_();

		/**
		 * The meta object literal for the '<em><b>Interpretation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUNDED_EXISTENCE_AFTER_UNTIL___INTERPRETATION = eINSTANCE
				.getBoundedExistenceAfter_until__Interpretation();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUNDED_EXISTENCE_AFTER_UNTIL___DESCRIPTION = eINSTANCE
				.getBoundedExistenceAfter_until__Description();

		/**
		 * The meta object literal for the '{@link comb.expression.metamodel.comb.impl.ExistenceAfter_Impl <em>Existence After </em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comb.expression.metamodel.comb.impl.ExistenceAfter_Impl
		 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getExistenceAfter_()
		 * @generated
		 */
		EClass EXISTENCE_AFTER_ = eINSTANCE.getExistenceAfter_();

		/**
		 * The meta object literal for the '<em><b>Interpretation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXISTENCE_AFTER___INTERPRETATION = eINSTANCE.getExistenceAfter__Interpretation();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXISTENCE_AFTER___DESCRIPTION = eINSTANCE.getExistenceAfter__Description();

		/**
		 * The meta object literal for the '{@link comb.expression.metamodel.comb.impl.BooleanOperatorsTwoParamsImpl <em>Boolean Operators Two Params</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comb.expression.metamodel.comb.impl.BooleanOperatorsTwoParamsImpl
		 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getBooleanOperatorsTwoParams()
		 * @generated
		 */
		EClass BOOLEAN_OPERATORS_TWO_PARAMS = eINSTANCE.getBooleanOperatorsTwoParams();

		/**
		 * The meta object literal for the '<em><b>Q</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_OPERATORS_TWO_PARAMS__Q = eINSTANCE.getBooleanOperatorsTwoParams_Q();

		/**
		 * The meta object literal for the '{@link comb.expression.metamodel.comb.impl.BooleanOperatorsOneParamImpl <em>Boolean Operators One Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comb.expression.metamodel.comb.impl.BooleanOperatorsOneParamImpl
		 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getBooleanOperatorsOneParam()
		 * @generated
		 */
		EClass BOOLEAN_OPERATORS_ONE_PARAM = eINSTANCE.getBooleanOperatorsOneParam();

		/**
		 * The meta object literal for the '{@link comb.expression.metamodel.comb.impl.ExistenceTwoParamsImpl <em>Existence Two Params</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comb.expression.metamodel.comb.impl.ExistenceTwoParamsImpl
		 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getExistenceTwoParams()
		 * @generated
		 */
		EClass EXISTENCE_TWO_PARAMS = eINSTANCE.getExistenceTwoParams();

		/**
		 * The meta object literal for the '<em><b>R</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXISTENCE_TWO_PARAMS__R = eINSTANCE.getExistenceTwoParams_R();

		/**
		 * The meta object literal for the '<em><b>Q</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXISTENCE_TWO_PARAMS__Q = eINSTANCE.getExistenceTwoParams_Q();

		/**
		 * The meta object literal for the '{@link comb.expression.metamodel.comb.impl.ExistenceImpl <em>Existence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comb.expression.metamodel.comb.impl.ExistenceImpl
		 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getExistence()
		 * @generated
		 */
		EClass EXISTENCE = eINSTANCE.getExistence();

		/**
		 * The meta object literal for the '{@link comb.expression.metamodel.comb.impl.UniversalityAfter_until_Impl <em>Universality After until </em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comb.expression.metamodel.comb.impl.UniversalityAfter_until_Impl
		 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getUniversalityAfter_until_()
		 * @generated
		 */
		EClass UNIVERSALITY_AFTER_UNTIL_ = eINSTANCE.getUniversalityAfter_until_();

		/**
		 * The meta object literal for the '<em><b>Interpretation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIVERSALITY_AFTER_UNTIL___INTERPRETATION = eINSTANCE.getUniversalityAfter_until__Interpretation();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIVERSALITY_AFTER_UNTIL___DESCRIPTION = eINSTANCE.getUniversalityAfter_until__Description();

		/**
		 * The meta object literal for the '{@link comb.expression.metamodel.comb.impl.ResponseGlobally_Impl <em>Response Globally </em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comb.expression.metamodel.comb.impl.ResponseGlobally_Impl
		 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getResponseGlobally_()
		 * @generated
		 */
		EClass RESPONSE_GLOBALLY_ = eINSTANCE.getResponseGlobally_();

		/**
		 * The meta object literal for the '<em><b>Interpretation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSE_GLOBALLY___INTERPRETATION = eINSTANCE.getResponseGlobally__Interpretation();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSE_GLOBALLY___DESCRIPTION = eINSTANCE.getResponseGlobally__Description();

		/**
		 * The meta object literal for the '{@link comb.expression.metamodel.comb.impl.ExistenceGlobally_Impl <em>Existence Globally </em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comb.expression.metamodel.comb.impl.ExistenceGlobally_Impl
		 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getExistenceGlobally_()
		 * @generated
		 */
		EClass EXISTENCE_GLOBALLY_ = eINSTANCE.getExistenceGlobally_();

		/**
		 * The meta object literal for the '<em><b>Interpretation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXISTENCE_GLOBALLY___INTERPRETATION = eINSTANCE.getExistenceGlobally__Interpretation();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXISTENCE_GLOBALLY___DESCRIPTION = eINSTANCE.getExistenceGlobally__Description();

		/**
		 * The meta object literal for the '{@link comb.expression.metamodel.comb.impl.BoundedExistenceBefore_Impl <em>Bounded Existence Before </em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comb.expression.metamodel.comb.impl.BoundedExistenceBefore_Impl
		 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getBoundedExistenceBefore_()
		 * @generated
		 */
		EClass BOUNDED_EXISTENCE_BEFORE_ = eINSTANCE.getBoundedExistenceBefore_();

		/**
		 * The meta object literal for the '<em><b>Interpretation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUNDED_EXISTENCE_BEFORE___INTERPRETATION = eINSTANCE.getBoundedExistenceBefore__Interpretation();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUNDED_EXISTENCE_BEFORE___DESCRIPTION = eINSTANCE.getBoundedExistenceBefore__Description();

		/**
		 * The meta object literal for the '{@link comb.expression.metamodel.comb.impl.Eventually_Impl <em>Eventually </em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comb.expression.metamodel.comb.impl.Eventually_Impl
		 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getEventually_()
		 * @generated
		 */
		EClass EVENTUALLY_ = eINSTANCE.getEventually_();

		/**
		 * The meta object literal for the '<em><b>Interpretation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENTUALLY___INTERPRETATION = eINSTANCE.getEventually__Interpretation();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENTUALLY___DESCRIPTION = eINSTANCE.getEventually__Description();

		/**
		 * The meta object literal for the '{@link comb.expression.metamodel.comb.impl._implies_Impl <em>implies </em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comb.expression.metamodel.comb.impl._implies_Impl
		 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#get_implies_()
		 * @generated
		 */
		EClass _IMPLIES_ = eINSTANCE.get_implies_();

		/**
		 * The meta object literal for the '<em><b>Interpretation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute _IMPLIES___INTERPRETATION = eINSTANCE.get_implies__Interpretation();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute _IMPLIES___DESCRIPTION = eINSTANCE.get_implies__Description();

		/**
		 * The meta object literal for the '{@link comb.expression.metamodel.comb.impl.UniversalityGlobally_Impl <em>Universality Globally </em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comb.expression.metamodel.comb.impl.UniversalityGlobally_Impl
		 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getUniversalityGlobally_()
		 * @generated
		 */
		EClass UNIVERSALITY_GLOBALLY_ = eINSTANCE.getUniversalityGlobally_();

		/**
		 * The meta object literal for the '<em><b>Interpretation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIVERSALITY_GLOBALLY___INTERPRETATION = eINSTANCE.getUniversalityGlobally__Interpretation();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIVERSALITY_GLOBALLY___DESCRIPTION = eINSTANCE.getUniversalityGlobally__Description();

		/**
		 * The meta object literal for the '{@link comb.expression.metamodel.comb.impl.PrecedenceTwoParamsImpl <em>Precedence Two Params</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comb.expression.metamodel.comb.impl.PrecedenceTwoParamsImpl
		 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getPrecedenceTwoParams()
		 * @generated
		 */
		EClass PRECEDENCE_TWO_PARAMS = eINSTANCE.getPrecedenceTwoParams();

		/**
		 * The meta object literal for the '<em><b>Q</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRECEDENCE_TWO_PARAMS__Q = eINSTANCE.getPrecedenceTwoParams_Q();

		/**
		 * The meta object literal for the '<em><b>R</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRECEDENCE_TWO_PARAMS__R = eINSTANCE.getPrecedenceTwoParams_R();

		/**
		 * The meta object literal for the '{@link comb.expression.metamodel.comb.impl.AbsenceAfter_Impl <em>Absence After </em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comb.expression.metamodel.comb.impl.AbsenceAfter_Impl
		 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getAbsenceAfter_()
		 * @generated
		 */
		EClass ABSENCE_AFTER_ = eINSTANCE.getAbsenceAfter_();

		/**
		 * The meta object literal for the '<em><b>Interpretation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSENCE_AFTER___INTERPRETATION = eINSTANCE.getAbsenceAfter__Interpretation();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSENCE_AFTER___DESCRIPTION = eINSTANCE.getAbsenceAfter__Description();

		/**
		 * The meta object literal for the '{@link comb.expression.metamodel.comb.impl.UniversalityImpl <em>Universality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comb.expression.metamodel.comb.impl.UniversalityImpl
		 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getUniversality()
		 * @generated
		 */
		EClass UNIVERSALITY = eINSTANCE.getUniversality();

		/**
		 * The meta object literal for the '{@link comb.expression.metamodel.comb.impl.PrecedenceOneParamImpl <em>Precedence One Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comb.expression.metamodel.comb.impl.PrecedenceOneParamImpl
		 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getPrecedenceOneParam()
		 * @generated
		 */
		EClass PRECEDENCE_ONE_PARAM = eINSTANCE.getPrecedenceOneParam();

		/**
		 * The meta object literal for the '<em><b>Q</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRECEDENCE_ONE_PARAM__Q = eINSTANCE.getPrecedenceOneParam_Q();

		/**
		 * The meta object literal for the '{@link comb.expression.metamodel.comb.impl.ResponseTwoParamsImpl <em>Response Two Params</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comb.expression.metamodel.comb.impl.ResponseTwoParamsImpl
		 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getResponseTwoParams()
		 * @generated
		 */
		EClass RESPONSE_TWO_PARAMS = eINSTANCE.getResponseTwoParams();

		/**
		 * The meta object literal for the '<em><b>Q</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_TWO_PARAMS__Q = eINSTANCE.getResponseTwoParams_Q();

		/**
		 * The meta object literal for the '<em><b>R</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_TWO_PARAMS__R = eINSTANCE.getResponseTwoParams_R();

		/**
		 * The meta object literal for the '{@link comb.expression.metamodel.comb.impl.ExistenceBefore_Impl <em>Existence Before </em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comb.expression.metamodel.comb.impl.ExistenceBefore_Impl
		 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getExistenceBefore_()
		 * @generated
		 */
		EClass EXISTENCE_BEFORE_ = eINSTANCE.getExistenceBefore_();

		/**
		 * The meta object literal for the '<em><b>Interpretation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXISTENCE_BEFORE___INTERPRETATION = eINSTANCE.getExistenceBefore__Interpretation();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXISTENCE_BEFORE___DESCRIPTION = eINSTANCE.getExistenceBefore__Description();

		/**
		 * The meta object literal for the '{@link comb.expression.metamodel.comb.impl.OccurrenceImpl <em>Occurrence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comb.expression.metamodel.comb.impl.OccurrenceImpl
		 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getOccurrence()
		 * @generated
		 */
		EClass OCCURRENCE = eINSTANCE.getOccurrence();

		/**
		 * The meta object literal for the '{@link comb.expression.metamodel.comb.impl.ResponseOneParamImpl <em>Response One Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comb.expression.metamodel.comb.impl.ResponseOneParamImpl
		 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getResponseOneParam()
		 * @generated
		 */
		EClass RESPONSE_ONE_PARAM = eINSTANCE.getResponseOneParam();

		/**
		 * The meta object literal for the '<em><b>Q</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_ONE_PARAM__Q = eINSTANCE.getResponseOneParam_Q();

		/**
		 * The meta object literal for the '{@link comb.expression.metamodel.comb.impl.UniversalityOneParamImpl <em>Universality One Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comb.expression.metamodel.comb.impl.UniversalityOneParamImpl
		 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getUniversalityOneParam()
		 * @generated
		 */
		EClass UNIVERSALITY_ONE_PARAM = eINSTANCE.getUniversalityOneParam();

		/**
		 * The meta object literal for the '<em><b>Q</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIVERSALITY_ONE_PARAM__Q = eINSTANCE.getUniversalityOneParam_Q();

		/**
		 * The meta object literal for the '{@link comb.expression.metamodel.comb.impl.PrecedenceGlobally_Impl <em>Precedence Globally </em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comb.expression.metamodel.comb.impl.PrecedenceGlobally_Impl
		 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getPrecedenceGlobally_()
		 * @generated
		 */
		EClass PRECEDENCE_GLOBALLY_ = eINSTANCE.getPrecedenceGlobally_();

		/**
		 * The meta object literal for the '<em><b>Interpretation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRECEDENCE_GLOBALLY___INTERPRETATION = eINSTANCE.getPrecedenceGlobally__Interpretation();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRECEDENCE_GLOBALLY___DESCRIPTION = eINSTANCE.getPrecedenceGlobally__Description();

		/**
		 * The meta object literal for the '{@link comb.expression.metamodel.comb.impl.LiteralImpl <em>Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comb.expression.metamodel.comb.impl.LiteralImpl
		 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getLiteral()
		 * @generated
		 */
		EClass LITERAL = eINSTANCE.getLiteral();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL__DESCRIPTION = eINSTANCE.getLiteral_Description();

		/**
		 * The meta object literal for the '{@link comb.expression.metamodel.comb.impl.Next_Impl <em>Next </em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comb.expression.metamodel.comb.impl.Next_Impl
		 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getNext_()
		 * @generated
		 */
		EClass NEXT_ = eINSTANCE.getNext_();

		/**
		 * The meta object literal for the '<em><b>Interpretation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NEXT___INTERPRETATION = eINSTANCE.getNext__Interpretation();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NEXT___DESCRIPTION = eINSTANCE.getNext__Description();

		/**
		 * The meta object literal for the '{@link comb.expression.metamodel.comb.impl.BoundedExistenceTwoParamsImpl <em>Bounded Existence Two Params</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comb.expression.metamodel.comb.impl.BoundedExistenceTwoParamsImpl
		 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getBoundedExistenceTwoParams()
		 * @generated
		 */
		EClass BOUNDED_EXISTENCE_TWO_PARAMS = eINSTANCE.getBoundedExistenceTwoParams();

		/**
		 * The meta object literal for the '<em><b>Q</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOUNDED_EXISTENCE_TWO_PARAMS__Q = eINSTANCE.getBoundedExistenceTwoParams_Q();

		/**
		 * The meta object literal for the '<em><b>R</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOUNDED_EXISTENCE_TWO_PARAMS__R = eINSTANCE.getBoundedExistenceTwoParams_R();

		/**
		 * The meta object literal for the '{@link comb.expression.metamodel.comb.impl.Not_Impl <em>Not </em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comb.expression.metamodel.comb.impl.Not_Impl
		 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getNot_()
		 * @generated
		 */
		EClass NOT_ = eINSTANCE.getNot_();

		/**
		 * The meta object literal for the '<em><b>Interpretation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOT___INTERPRETATION = eINSTANCE.getNot__Interpretation();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOT___DESCRIPTION = eINSTANCE.getNot__Description();

		/**
		 * The meta object literal for the '{@link comb.expression.metamodel.comb.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comb.expression.metamodel.comb.impl.ElementImpl
		 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__NAME = eINSTANCE.getElement_Name();

		/**
		 * The meta object literal for the '<em><b>Subtree Interpretations</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__SUBTREE_INTERPRETATIONS = eINSTANCE.getElement_SubtreeInterpretations();

		/**
		 * The meta object literal for the '<em><b>Logic Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__LOGIC_GROUP = eINSTANCE.getElement_LogicGroup();

		/**
		 * The meta object literal for the '{@link comb.expression.metamodel.comb.impl.LTLOperatorsTwoParamsImpl <em>LTL Operators Two Params</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comb.expression.metamodel.comb.impl.LTLOperatorsTwoParamsImpl
		 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getLTLOperatorsTwoParams()
		 * @generated
		 */
		EClass LTL_OPERATORS_TWO_PARAMS = eINSTANCE.getLTLOperatorsTwoParams();

		/**
		 * The meta object literal for the '<em><b>Q</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LTL_OPERATORS_TWO_PARAMS__Q = eINSTANCE.getLTLOperatorsTwoParams_Q();

		/**
		 * The meta object literal for the '{@link comb.expression.metamodel.comb.impl.EventuallyWithin_and_Impl <em>Eventually Within and </em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comb.expression.metamodel.comb.impl.EventuallyWithin_and_Impl
		 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getEventuallyWithin_and_()
		 * @generated
		 */
		EClass EVENTUALLY_WITHIN_AND_ = eINSTANCE.getEventuallyWithin_and_();

		/**
		 * The meta object literal for the '<em><b>Interpretation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENTUALLY_WITHIN_AND___INTERPRETATION = eINSTANCE.getEventuallyWithin_and__Interpretation();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENTUALLY_WITHIN_AND___DESCRIPTION = eINSTANCE.getEventuallyWithin_and__Description();

		/**
		 * The meta object literal for the '<em><b>L</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENTUALLY_WITHIN_AND___L = eINSTANCE.getEventuallyWithin_and__L();

		/**
		 * The meta object literal for the '<em><b>H</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENTUALLY_WITHIN_AND___H = eINSTANCE.getEventuallyWithin_and__H();

		/**
		 * The meta object literal for the '{@link comb.expression.metamodel.comb.impl._untilWithin_and_Impl <em>until Within and </em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comb.expression.metamodel.comb.impl._untilWithin_and_Impl
		 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#get_untilWithin_and_()
		 * @generated
		 */
		EClass _UNTIL_WITHIN_AND_ = eINSTANCE.get_untilWithin_and_();

		/**
		 * The meta object literal for the '<em><b>Interpretation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute _UNTIL_WITHIN_AND___INTERPRETATION = eINSTANCE.get_untilWithin_and__Interpretation();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute _UNTIL_WITHIN_AND___DESCRIPTION = eINSTANCE.get_untilWithin_and__Description();

		/**
		 * The meta object literal for the '<em><b>L</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference _UNTIL_WITHIN_AND___L = eINSTANCE.get_untilWithin_and__L();

		/**
		 * The meta object literal for the '<em><b>H</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference _UNTIL_WITHIN_AND___H = eINSTANCE.get_untilWithin_and__H();

		/**
		 * The meta object literal for the '{@link comb.expression.metamodel.comb.impl.AlwaysWithin_and_Impl <em>Always Within and </em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comb.expression.metamodel.comb.impl.AlwaysWithin_and_Impl
		 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getAlwaysWithin_and_()
		 * @generated
		 */
		EClass ALWAYS_WITHIN_AND_ = eINSTANCE.getAlwaysWithin_and_();

		/**
		 * The meta object literal for the '<em><b>Interpretation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALWAYS_WITHIN_AND___INTERPRETATION = eINSTANCE.getAlwaysWithin_and__Interpretation();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALWAYS_WITHIN_AND___DESCRIPTION = eINSTANCE.getAlwaysWithin_and__Description();

		/**
		 * The meta object literal for the '<em><b>L</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALWAYS_WITHIN_AND___L = eINSTANCE.getAlwaysWithin_and__L();

		/**
		 * The meta object literal for the '<em><b>H</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALWAYS_WITHIN_AND___H = eINSTANCE.getAlwaysWithin_and__H();

		/**
		 * The meta object literal for the '{@link comb.expression.metamodel.comb.impl.MITLOperatorsImpl <em>MITL Operators</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comb.expression.metamodel.comb.impl.MITLOperatorsImpl
		 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getMITLOperators()
		 * @generated
		 */
		EClass MITL_OPERATORS = eINSTANCE.getMITLOperators();

		/**
		 * The meta object literal for the '<em><b>P</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MITL_OPERATORS__P = eINSTANCE.getMITLOperators_P();

		/**
		 * The meta object literal for the '{@link comb.expression.metamodel.comb.impl.MITLOperatorsOneParamImpl <em>MITL Operators One Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comb.expression.metamodel.comb.impl.MITLOperatorsOneParamImpl
		 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getMITLOperatorsOneParam()
		 * @generated
		 */
		EClass MITL_OPERATORS_ONE_PARAM = eINSTANCE.getMITLOperatorsOneParam();

		/**
		 * The meta object literal for the '{@link comb.expression.metamodel.comb.impl.MITLOperatorsTwoParamsImpl <em>MITL Operators Two Params</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comb.expression.metamodel.comb.impl.MITLOperatorsTwoParamsImpl
		 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getMITLOperatorsTwoParams()
		 * @generated
		 */
		EClass MITL_OPERATORS_TWO_PARAMS = eINSTANCE.getMITLOperatorsTwoParams();

		/**
		 * The meta object literal for the '<em><b>Q</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MITL_OPERATORS_TWO_PARAMS__Q = eINSTANCE.getMITLOperatorsTwoParams_Q();

		/**
		 * The meta object literal for the '{@link comb.expression.metamodel.comb.impl.CombImpl <em>Comb</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comb.expression.metamodel.comb.impl.CombImpl
		 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getComb()
		 * @generated
		 */
		EClass COMB = eINSTANCE.getComb();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMB__ELEMENT = eINSTANCE.getComb_Element();

		/**
		 * The meta object literal for the '{@link comb.expression.metamodel.comb.impl.MTLOperatorsImpl <em>MTL Operators</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comb.expression.metamodel.comb.impl.MTLOperatorsImpl
		 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getMTLOperators()
		 * @generated
		 */
		EClass MTL_OPERATORS = eINSTANCE.getMTLOperators();

		/**
		 * The meta object literal for the '<em><b>P</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MTL_OPERATORS__P = eINSTANCE.getMTLOperators_P();

		/**
		 * The meta object literal for the '{@link comb.expression.metamodel.comb.impl.MTLOperatorsOneParamImpl <em>MTL Operators One Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comb.expression.metamodel.comb.impl.MTLOperatorsOneParamImpl
		 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getMTLOperatorsOneParam()
		 * @generated
		 */
		EClass MTL_OPERATORS_ONE_PARAM = eINSTANCE.getMTLOperatorsOneParam();

		/**
		 * The meta object literal for the '{@link comb.expression.metamodel.comb.impl.MTLOperatorsTwoParamsImpl <em>MTL Operators Two Params</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comb.expression.metamodel.comb.impl.MTLOperatorsTwoParamsImpl
		 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getMTLOperatorsTwoParams()
		 * @generated
		 */
		EClass MTL_OPERATORS_TWO_PARAMS = eINSTANCE.getMTLOperatorsTwoParams();

		/**
		 * The meta object literal for the '<em><b>Q</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MTL_OPERATORS_TWO_PARAMS__Q = eINSTANCE.getMTLOperatorsTwoParams_Q();

		/**
		 * The meta object literal for the '{@link comb.expression.metamodel.comb.impl._untilWithin_Impl <em>until Within </em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comb.expression.metamodel.comb.impl._untilWithin_Impl
		 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#get_untilWithin_()
		 * @generated
		 */
		EClass _UNTIL_WITHIN_ = eINSTANCE.get_untilWithin_();

		/**
		 * The meta object literal for the '<em><b>Interpretation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute _UNTIL_WITHIN___INTERPRETATION = eINSTANCE.get_untilWithin__Interpretation();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute _UNTIL_WITHIN___DESCRIPTION = eINSTANCE.get_untilWithin__Description();

		/**
		 * The meta object literal for the '<em><b>H</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference _UNTIL_WITHIN___H = eINSTANCE.get_untilWithin__H();

		/**
		 * The meta object literal for the '{@link comb.expression.metamodel.comb.impl.AlwaysWithin_Impl <em>Always Within </em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comb.expression.metamodel.comb.impl.AlwaysWithin_Impl
		 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getAlwaysWithin_()
		 * @generated
		 */
		EClass ALWAYS_WITHIN_ = eINSTANCE.getAlwaysWithin_();

		/**
		 * The meta object literal for the '<em><b>Interpretation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALWAYS_WITHIN___INTERPRETATION = eINSTANCE.getAlwaysWithin__Interpretation();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALWAYS_WITHIN___DESCRIPTION = eINSTANCE.getAlwaysWithin__Description();

		/**
		 * The meta object literal for the '<em><b>H</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALWAYS_WITHIN___H = eINSTANCE.getAlwaysWithin__H();

		/**
		 * The meta object literal for the '{@link comb.expression.metamodel.comb.impl.EventuallyWithin_Impl <em>Eventually Within </em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comb.expression.metamodel.comb.impl.EventuallyWithin_Impl
		 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getEventuallyWithin_()
		 * @generated
		 */
		EClass EVENTUALLY_WITHIN_ = eINSTANCE.getEventuallyWithin_();

		/**
		 * The meta object literal for the '<em><b>Interpretation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENTUALLY_WITHIN___INTERPRETATION = eINSTANCE.getEventuallyWithin__Interpretation();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENTUALLY_WITHIN___DESCRIPTION = eINSTANCE.getEventuallyWithin__Description();

		/**
		 * The meta object literal for the '<em><b>H</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENTUALLY_WITHIN___H = eINSTANCE.getEventuallyWithin__H();

		/**
		 * The meta object literal for the '{@link comb.expression.metamodel.comb.impl.RelationImpl <em>Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comb.expression.metamodel.comb.impl.RelationImpl
		 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getRelation()
		 * @generated
		 */
		EClass RELATION = eINSTANCE.getRelation();

		/**
		 * The meta object literal for the '<em><b>P</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__P = eINSTANCE.getRelation_P();

		/**
		 * The meta object literal for the '<em><b>Q</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__Q = eINSTANCE.getRelation_Q();

		/**
		 * The meta object literal for the '{@link comb.expression.metamodel.comb.impl._lessThan_Impl <em>less Than </em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comb.expression.metamodel.comb.impl._lessThan_Impl
		 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#get_lessThan_()
		 * @generated
		 */
		EClass _LESS_THAN_ = eINSTANCE.get_lessThan_();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute _LESS_THAN___DESCRIPTION = eINSTANCE.get_lessThan__Description();

		/**
		 * The meta object literal for the '<em><b>Interpretation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute _LESS_THAN___INTERPRETATION = eINSTANCE.get_lessThan__Interpretation();

		/**
		 * The meta object literal for the '{@link comb.expression.metamodel.comb.impl._lessThanOrEqual_Impl <em>less Than Or Equal </em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comb.expression.metamodel.comb.impl._lessThanOrEqual_Impl
		 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#get_lessThanOrEqual_()
		 * @generated
		 */
		EClass _LESS_THAN_OR_EQUAL_ = eINSTANCE.get_lessThanOrEqual_();

		/**
		 * The meta object literal for the '<em><b>Interpretation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute _LESS_THAN_OR_EQUAL___INTERPRETATION = eINSTANCE.get_lessThanOrEqual__Interpretation();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute _LESS_THAN_OR_EQUAL___DESCRIPTION = eINSTANCE.get_lessThanOrEqual__Description();

		/**
		 * The meta object literal for the '{@link comb.expression.metamodel.comb.impl._equal_Impl <em>equal </em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comb.expression.metamodel.comb.impl._equal_Impl
		 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#get_equal_()
		 * @generated
		 */
		EClass _EQUAL_ = eINSTANCE.get_equal_();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute _EQUAL___DESCRIPTION = eINSTANCE.get_equal__Description();

		/**
		 * The meta object literal for the '<em><b>Interpretation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute _EQUAL___INTERPRETATION = eINSTANCE.get_equal__Interpretation();

		/**
		 * The meta object literal for the '{@link comb.expression.metamodel.comb.impl._greaterThan_Impl <em>greater Than </em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comb.expression.metamodel.comb.impl._greaterThan_Impl
		 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#get_greaterThan_()
		 * @generated
		 */
		EClass _GREATER_THAN_ = eINSTANCE.get_greaterThan_();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute _GREATER_THAN___DESCRIPTION = eINSTANCE.get_greaterThan__Description();

		/**
		 * The meta object literal for the '<em><b>Interpretation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute _GREATER_THAN___INTERPRETATION = eINSTANCE.get_greaterThan__Interpretation();

		/**
		 * The meta object literal for the '{@link comb.expression.metamodel.comb.impl._greaterThanOrEqual_Impl <em>greater Than Or Equal </em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comb.expression.metamodel.comb.impl._greaterThanOrEqual_Impl
		 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#get_greaterThanOrEqual_()
		 * @generated
		 */
		EClass _GREATER_THAN_OR_EQUAL_ = eINSTANCE.get_greaterThanOrEqual_();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute _GREATER_THAN_OR_EQUAL___DESCRIPTION = eINSTANCE.get_greaterThanOrEqual__Description();

		/**
		 * The meta object literal for the '<em><b>Interpretation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute _GREATER_THAN_OR_EQUAL___INTERPRETATION = eINSTANCE.get_greaterThanOrEqual__Interpretation();

		/**
		 * The meta object literal for the '{@link comb.expression.metamodel.comb.impl.STLOperatorsImpl <em>STL Operators</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comb.expression.metamodel.comb.impl.STLOperatorsImpl
		 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getSTLOperators()
		 * @generated
		 */
		EClass STL_OPERATORS = eINSTANCE.getSTLOperators();

		/**
		 * The meta object literal for the '{@link comb.expression.metamodel.comb.impl.LTLPatternMappingsImpl <em>LTL Pattern Mappings</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comb.expression.metamodel.comb.impl.LTLPatternMappingsImpl
		 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getLTLPatternMappings()
		 * @generated
		 */
		EClass LTL_PATTERN_MAPPINGS = eINSTANCE.getLTLPatternMappings();

		/**
		 * The meta object literal for the '{@link comb.expression.metamodel.comb.LogicGroup <em>Logic Group</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comb.expression.metamodel.comb.LogicGroup
		 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getLogicGroup()
		 * @generated
		 */
		EEnum LOGIC_GROUP = eINSTANCE.getLogicGroup();

		/**
		 * The meta object literal for the '{@link comb.expression.metamodel.comb.SupportedOutput <em>Supported Output</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comb.expression.metamodel.comb.SupportedOutput
		 * @see comb.expression.metamodel.comb.impl.CombPackageImpl#getSupportedOutput()
		 * @generated
		 */
		EEnum SUPPORTED_OUTPUT = eINSTANCE.getSupportedOutput();

	}

} //CombPackage
