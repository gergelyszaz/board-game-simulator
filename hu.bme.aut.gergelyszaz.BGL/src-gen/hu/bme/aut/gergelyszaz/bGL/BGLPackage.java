/**
 */
package hu.bme.aut.gergelyszaz.bGL;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see hu.bme.aut.gergelyszaz.bGL.BGLFactory
 * @model kind="package"
 * @generated
 */
public interface BGLPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "bGL";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.bme.hu/aut/gergelyszaz/BGL";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "bGL";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  BGLPackage eINSTANCE = hu.bme.aut.gergelyszaz.bGL.impl.BGLPackageImpl.init();

  /**
   * The meta object id for the '{@link hu.bme.aut.gergelyszaz.bGL.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.aut.gergelyszaz.bGL.impl.ModelImpl
   * @see hu.bme.aut.gergelyszaz.bGL.impl.BGLPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__NAME = 0;

  /**
   * The feature id for the '<em><b>Player</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__PLAYER = 1;

  /**
   * The feature id for the '<em><b>Board</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__BOARD = 2;

  /**
   * The feature id for the '<em><b>Tokens</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__TOKENS = 3;

  /**
   * The feature id for the '<em><b>Rules</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__RULES = 4;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link hu.bme.aut.gergelyszaz.bGL.impl.PlayerImpl <em>Player</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.aut.gergelyszaz.bGL.impl.PlayerImpl
   * @see hu.bme.aut.gergelyszaz.bGL.impl.BGLPackageImpl#getPlayer()
   * @generated
   */
  int PLAYER = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLAYER__NAME = 0;

  /**
   * The feature id for the '<em><b>Playercount</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLAYER__PLAYERCOUNT = 1;

  /**
   * The number of structural features of the '<em>Player</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLAYER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link hu.bme.aut.gergelyszaz.bGL.impl.BoardImpl <em>Board</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.aut.gergelyszaz.bGL.impl.BoardImpl
   * @see hu.bme.aut.gergelyszaz.bGL.impl.BGLPackageImpl#getBoard()
   * @generated
   */
  int BOARD = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOARD__NAME = 0;

  /**
   * The feature id for the '<em><b>Fields</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOARD__FIELDS = 1;

  /**
   * The number of structural features of the '<em>Board</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOARD_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link hu.bme.aut.gergelyszaz.bGL.impl.RulesImpl <em>Rules</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.aut.gergelyszaz.bGL.impl.RulesImpl
   * @see hu.bme.aut.gergelyszaz.bGL.impl.BGLPackageImpl#getRules()
   * @generated
   */
  int RULES = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULES__NAME = 0;

  /**
   * The feature id for the '<em><b>Turnrules</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULES__TURNRULES = 1;

  /**
   * The number of structural features of the '<em>Rules</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULES_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link hu.bme.aut.gergelyszaz.bGL.impl.TurnRulesImpl <em>Turn Rules</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.aut.gergelyszaz.bGL.impl.TurnRulesImpl
   * @see hu.bme.aut.gergelyszaz.bGL.impl.BGLPackageImpl#getTurnRules()
   * @generated
   */
  int TURN_RULES = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TURN_RULES__NAME = 0;

  /**
   * The feature id for the '<em><b>Actions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TURN_RULES__ACTIONS = 1;

  /**
   * The number of structural features of the '<em>Turn Rules</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TURN_RULES_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link hu.bme.aut.gergelyszaz.bGL.impl.TokenImpl <em>Token</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.aut.gergelyszaz.bGL.impl.TokenImpl
   * @see hu.bme.aut.gergelyszaz.bGL.impl.BGLPackageImpl#getToken()
   * @generated
   */
  int TOKEN = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOKEN__NAME = 0;

  /**
   * The number of structural features of the '<em>Token</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOKEN_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link hu.bme.aut.gergelyszaz.bGL.impl.FieldImpl <em>Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.aut.gergelyszaz.bGL.impl.FieldImpl
   * @see hu.bme.aut.gergelyszaz.bGL.impl.BGLPackageImpl#getField()
   * @generated
   */
  int FIELD = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__NAME = 0;

  /**
   * The feature id for the '<em><b>X</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__X = 1;

  /**
   * The feature id for the '<em><b>Y</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__Y = 2;

  /**
   * The feature id for the '<em><b>Z</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__Z = 3;

  /**
   * The feature id for the '<em><b>Neighbours</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__NEIGHBOURS = 4;

  /**
   * The number of structural features of the '<em>Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link hu.bme.aut.gergelyszaz.bGL.impl.ActionImpl <em>Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.aut.gergelyszaz.bGL.impl.ActionImpl
   * @see hu.bme.aut.gergelyszaz.bGL.impl.BGLPackageImpl#getAction()
   * @generated
   */
  int ACTION = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__NAME = 0;

  /**
   * The feature id for the '<em><b>Token</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__TOKEN = 1;

  /**
   * The feature id for the '<em><b>Object Of Select</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__OBJECT_OF_SELECT = 2;

  /**
   * The feature id for the '<em><b>Filter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__FILTER = 3;

  /**
   * The feature id for the '<em><b>Assignment</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__ASSIGNMENT = 4;

  /**
   * The number of structural features of the '<em>Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link hu.bme.aut.gergelyszaz.bGL.impl.OrExpImpl <em>Or Exp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.aut.gergelyszaz.bGL.impl.OrExpImpl
   * @see hu.bme.aut.gergelyszaz.bGL.impl.BGLPackageImpl#getOrExp()
   * @generated
   */
  int OR_EXP = 8;

  /**
   * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXP__EXPRESSIONS = 0;

  /**
   * The feature id for the '<em><b>Operators</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXP__OPERATORS = 1;

  /**
   * The number of structural features of the '<em>Or Exp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXP_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link hu.bme.aut.gergelyszaz.bGL.impl.AndExpImpl <em>And Exp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.aut.gergelyszaz.bGL.impl.AndExpImpl
   * @see hu.bme.aut.gergelyszaz.bGL.impl.BGLPackageImpl#getAndExp()
   * @generated
   */
  int AND_EXP = 9;

  /**
   * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXP__EXPRESSIONS = 0;

  /**
   * The feature id for the '<em><b>Operators</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXP__OPERATORS = 1;

  /**
   * The number of structural features of the '<em>And Exp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXP_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link hu.bme.aut.gergelyszaz.bGL.impl.BooleanExpImpl <em>Boolean Exp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.aut.gergelyszaz.bGL.impl.BooleanExpImpl
   * @see hu.bme.aut.gergelyszaz.bGL.impl.BGLPackageImpl#getBooleanExp()
   * @generated
   */
  int BOOLEAN_EXP = 10;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_EXP__LEFT = 0;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_EXP__OPERATOR = 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_EXP__RIGHT = 2;

  /**
   * The feature id for the '<em><b>Nested Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_EXP__NESTED_EXP = 3;

  /**
   * The number of structural features of the '<em>Boolean Exp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_EXP_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link hu.bme.aut.gergelyszaz.bGL.impl.AttributeNameImpl <em>Attribute Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.aut.gergelyszaz.bGL.impl.AttributeNameImpl
   * @see hu.bme.aut.gergelyszaz.bGL.impl.BGLPackageImpl#getAttributeName()
   * @generated
   */
  int ATTRIBUTE_NAME = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_NAME__NAME = 0;

  /**
   * The feature id for the '<em><b>Parent</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_NAME__PARENT = 1;

  /**
   * The feature id for the '<em><b>Child</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_NAME__CHILD = 2;

  /**
   * The number of structural features of the '<em>Attribute Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_NAME_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link hu.bme.aut.gergelyszaz.bGL.impl.AttributeOrIntImpl <em>Attribute Or Int</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.aut.gergelyszaz.bGL.impl.AttributeOrIntImpl
   * @see hu.bme.aut.gergelyszaz.bGL.impl.BGLPackageImpl#getAttributeOrInt()
   * @generated
   */
  int ATTRIBUTE_OR_INT = 12;

  /**
   * The feature id for the '<em><b>Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_OR_INT__ATTRIBUTE = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_OR_INT__VALUE = 1;

  /**
   * The number of structural features of the '<em>Attribute Or Int</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_OR_INT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link hu.bme.aut.gergelyszaz.bGL.impl.MultiplicationExpImpl <em>Multiplication Exp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.aut.gergelyszaz.bGL.impl.MultiplicationExpImpl
   * @see hu.bme.aut.gergelyszaz.bGL.impl.BGLPackageImpl#getMultiplicationExp()
   * @generated
   */
  int MULTIPLICATION_EXP = 14;

  /**
   * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION_EXP__EXPRESSIONS = 0;

  /**
   * The feature id for the '<em><b>Operators</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION_EXP__OPERATORS = 1;

  /**
   * The number of structural features of the '<em>Multiplication Exp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION_EXP_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link hu.bme.aut.gergelyszaz.bGL.impl.AddtionExpImpl <em>Addtion Exp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.aut.gergelyszaz.bGL.impl.AddtionExpImpl
   * @see hu.bme.aut.gergelyszaz.bGL.impl.BGLPackageImpl#getAddtionExp()
   * @generated
   */
  int ADDTION_EXP = 13;

  /**
   * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDTION_EXP__EXPRESSIONS = MULTIPLICATION_EXP__EXPRESSIONS;

  /**
   * The feature id for the '<em><b>Operators</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDTION_EXP__OPERATORS = MULTIPLICATION_EXP__OPERATORS;

  /**
   * The number of structural features of the '<em>Addtion Exp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDTION_EXP_FEATURE_COUNT = MULTIPLICATION_EXP_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link hu.bme.aut.gergelyszaz.bGL.impl.ValueAssignmentImpl <em>Value Assignment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.aut.gergelyszaz.bGL.impl.ValueAssignmentImpl
   * @see hu.bme.aut.gergelyszaz.bGL.impl.BGLPackageImpl#getValueAssignment()
   * @generated
   */
  int VALUE_ASSIGNMENT = 15;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_ASSIGNMENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Addition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_ASSIGNMENT__ADDITION = 1;

  /**
   * The number of structural features of the '<em>Value Assignment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_ASSIGNMENT_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link hu.bme.aut.gergelyszaz.bGL.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see hu.bme.aut.gergelyszaz.bGL.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.aut.gergelyszaz.bGL.Model#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see hu.bme.aut.gergelyszaz.bGL.Model#getName()
   * @see #getModel()
   * @generated
   */
  EAttribute getModel_Name();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.aut.gergelyszaz.bGL.Model#getPlayer <em>Player</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Player</em>'.
   * @see hu.bme.aut.gergelyszaz.bGL.Model#getPlayer()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Player();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.aut.gergelyszaz.bGL.Model#getBoard <em>Board</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Board</em>'.
   * @see hu.bme.aut.gergelyszaz.bGL.Model#getBoard()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Board();

  /**
   * Returns the meta object for the containment reference list '{@link hu.bme.aut.gergelyszaz.bGL.Model#getTokens <em>Tokens</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Tokens</em>'.
   * @see hu.bme.aut.gergelyszaz.bGL.Model#getTokens()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Tokens();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.aut.gergelyszaz.bGL.Model#getRules <em>Rules</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rules</em>'.
   * @see hu.bme.aut.gergelyszaz.bGL.Model#getRules()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Rules();

  /**
   * Returns the meta object for class '{@link hu.bme.aut.gergelyszaz.bGL.Player <em>Player</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Player</em>'.
   * @see hu.bme.aut.gergelyszaz.bGL.Player
   * @generated
   */
  EClass getPlayer();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.aut.gergelyszaz.bGL.Player#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see hu.bme.aut.gergelyszaz.bGL.Player#getName()
   * @see #getPlayer()
   * @generated
   */
  EAttribute getPlayer_Name();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.aut.gergelyszaz.bGL.Player#getPlayercount <em>Playercount</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Playercount</em>'.
   * @see hu.bme.aut.gergelyszaz.bGL.Player#getPlayercount()
   * @see #getPlayer()
   * @generated
   */
  EAttribute getPlayer_Playercount();

  /**
   * Returns the meta object for class '{@link hu.bme.aut.gergelyszaz.bGL.Board <em>Board</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Board</em>'.
   * @see hu.bme.aut.gergelyszaz.bGL.Board
   * @generated
   */
  EClass getBoard();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.aut.gergelyszaz.bGL.Board#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see hu.bme.aut.gergelyszaz.bGL.Board#getName()
   * @see #getBoard()
   * @generated
   */
  EAttribute getBoard_Name();

  /**
   * Returns the meta object for the containment reference list '{@link hu.bme.aut.gergelyszaz.bGL.Board#getFields <em>Fields</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Fields</em>'.
   * @see hu.bme.aut.gergelyszaz.bGL.Board#getFields()
   * @see #getBoard()
   * @generated
   */
  EReference getBoard_Fields();

  /**
   * Returns the meta object for class '{@link hu.bme.aut.gergelyszaz.bGL.Rules <em>Rules</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rules</em>'.
   * @see hu.bme.aut.gergelyszaz.bGL.Rules
   * @generated
   */
  EClass getRules();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.aut.gergelyszaz.bGL.Rules#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see hu.bme.aut.gergelyszaz.bGL.Rules#getName()
   * @see #getRules()
   * @generated
   */
  EAttribute getRules_Name();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.aut.gergelyszaz.bGL.Rules#getTurnrules <em>Turnrules</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Turnrules</em>'.
   * @see hu.bme.aut.gergelyszaz.bGL.Rules#getTurnrules()
   * @see #getRules()
   * @generated
   */
  EReference getRules_Turnrules();

  /**
   * Returns the meta object for class '{@link hu.bme.aut.gergelyszaz.bGL.TurnRules <em>Turn Rules</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Turn Rules</em>'.
   * @see hu.bme.aut.gergelyszaz.bGL.TurnRules
   * @generated
   */
  EClass getTurnRules();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.aut.gergelyszaz.bGL.TurnRules#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see hu.bme.aut.gergelyszaz.bGL.TurnRules#getName()
   * @see #getTurnRules()
   * @generated
   */
  EAttribute getTurnRules_Name();

  /**
   * Returns the meta object for the containment reference list '{@link hu.bme.aut.gergelyszaz.bGL.TurnRules#getActions <em>Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Actions</em>'.
   * @see hu.bme.aut.gergelyszaz.bGL.TurnRules#getActions()
   * @see #getTurnRules()
   * @generated
   */
  EReference getTurnRules_Actions();

  /**
   * Returns the meta object for class '{@link hu.bme.aut.gergelyszaz.bGL.Token <em>Token</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Token</em>'.
   * @see hu.bme.aut.gergelyszaz.bGL.Token
   * @generated
   */
  EClass getToken();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.aut.gergelyszaz.bGL.Token#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see hu.bme.aut.gergelyszaz.bGL.Token#getName()
   * @see #getToken()
   * @generated
   */
  EAttribute getToken_Name();

  /**
   * Returns the meta object for class '{@link hu.bme.aut.gergelyszaz.bGL.Field <em>Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Field</em>'.
   * @see hu.bme.aut.gergelyszaz.bGL.Field
   * @generated
   */
  EClass getField();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.aut.gergelyszaz.bGL.Field#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see hu.bme.aut.gergelyszaz.bGL.Field#getName()
   * @see #getField()
   * @generated
   */
  EAttribute getField_Name();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.aut.gergelyszaz.bGL.Field#getX <em>X</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>X</em>'.
   * @see hu.bme.aut.gergelyszaz.bGL.Field#getX()
   * @see #getField()
   * @generated
   */
  EAttribute getField_X();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.aut.gergelyszaz.bGL.Field#getY <em>Y</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Y</em>'.
   * @see hu.bme.aut.gergelyszaz.bGL.Field#getY()
   * @see #getField()
   * @generated
   */
  EAttribute getField_Y();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.aut.gergelyszaz.bGL.Field#getZ <em>Z</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Z</em>'.
   * @see hu.bme.aut.gergelyszaz.bGL.Field#getZ()
   * @see #getField()
   * @generated
   */
  EAttribute getField_Z();

  /**
   * Returns the meta object for the reference list '{@link hu.bme.aut.gergelyszaz.bGL.Field#getNeighbours <em>Neighbours</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Neighbours</em>'.
   * @see hu.bme.aut.gergelyszaz.bGL.Field#getNeighbours()
   * @see #getField()
   * @generated
   */
  EReference getField_Neighbours();

  /**
   * Returns the meta object for class '{@link hu.bme.aut.gergelyszaz.bGL.Action <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action</em>'.
   * @see hu.bme.aut.gergelyszaz.bGL.Action
   * @generated
   */
  EClass getAction();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.aut.gergelyszaz.bGL.Action#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see hu.bme.aut.gergelyszaz.bGL.Action#getName()
   * @see #getAction()
   * @generated
   */
  EAttribute getAction_Name();

  /**
   * Returns the meta object for the reference '{@link hu.bme.aut.gergelyszaz.bGL.Action#getToken <em>Token</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Token</em>'.
   * @see hu.bme.aut.gergelyszaz.bGL.Action#getToken()
   * @see #getAction()
   * @generated
   */
  EReference getAction_Token();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.aut.gergelyszaz.bGL.Action#getObjectOfSelect <em>Object Of Select</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Object Of Select</em>'.
   * @see hu.bme.aut.gergelyszaz.bGL.Action#getObjectOfSelect()
   * @see #getAction()
   * @generated
   */
  EAttribute getAction_ObjectOfSelect();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.aut.gergelyszaz.bGL.Action#getFilter <em>Filter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Filter</em>'.
   * @see hu.bme.aut.gergelyszaz.bGL.Action#getFilter()
   * @see #getAction()
   * @generated
   */
  EReference getAction_Filter();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.aut.gergelyszaz.bGL.Action#getAssignment <em>Assignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Assignment</em>'.
   * @see hu.bme.aut.gergelyszaz.bGL.Action#getAssignment()
   * @see #getAction()
   * @generated
   */
  EReference getAction_Assignment();

  /**
   * Returns the meta object for class '{@link hu.bme.aut.gergelyszaz.bGL.OrExp <em>Or Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Or Exp</em>'.
   * @see hu.bme.aut.gergelyszaz.bGL.OrExp
   * @generated
   */
  EClass getOrExp();

  /**
   * Returns the meta object for the containment reference list '{@link hu.bme.aut.gergelyszaz.bGL.OrExp#getExpressions <em>Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expressions</em>'.
   * @see hu.bme.aut.gergelyszaz.bGL.OrExp#getExpressions()
   * @see #getOrExp()
   * @generated
   */
  EReference getOrExp_Expressions();

  /**
   * Returns the meta object for the attribute list '{@link hu.bme.aut.gergelyszaz.bGL.OrExp#getOperators <em>Operators</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Operators</em>'.
   * @see hu.bme.aut.gergelyszaz.bGL.OrExp#getOperators()
   * @see #getOrExp()
   * @generated
   */
  EAttribute getOrExp_Operators();

  /**
   * Returns the meta object for class '{@link hu.bme.aut.gergelyszaz.bGL.AndExp <em>And Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>And Exp</em>'.
   * @see hu.bme.aut.gergelyszaz.bGL.AndExp
   * @generated
   */
  EClass getAndExp();

  /**
   * Returns the meta object for the containment reference list '{@link hu.bme.aut.gergelyszaz.bGL.AndExp#getExpressions <em>Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expressions</em>'.
   * @see hu.bme.aut.gergelyszaz.bGL.AndExp#getExpressions()
   * @see #getAndExp()
   * @generated
   */
  EReference getAndExp_Expressions();

  /**
   * Returns the meta object for the attribute list '{@link hu.bme.aut.gergelyszaz.bGL.AndExp#getOperators <em>Operators</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Operators</em>'.
   * @see hu.bme.aut.gergelyszaz.bGL.AndExp#getOperators()
   * @see #getAndExp()
   * @generated
   */
  EAttribute getAndExp_Operators();

  /**
   * Returns the meta object for class '{@link hu.bme.aut.gergelyszaz.bGL.BooleanExp <em>Boolean Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Exp</em>'.
   * @see hu.bme.aut.gergelyszaz.bGL.BooleanExp
   * @generated
   */
  EClass getBooleanExp();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.aut.gergelyszaz.bGL.BooleanExp#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see hu.bme.aut.gergelyszaz.bGL.BooleanExp#getLeft()
   * @see #getBooleanExp()
   * @generated
   */
  EReference getBooleanExp_Left();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.aut.gergelyszaz.bGL.BooleanExp#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see hu.bme.aut.gergelyszaz.bGL.BooleanExp#getOperator()
   * @see #getBooleanExp()
   * @generated
   */
  EAttribute getBooleanExp_Operator();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.aut.gergelyszaz.bGL.BooleanExp#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see hu.bme.aut.gergelyszaz.bGL.BooleanExp#getRight()
   * @see #getBooleanExp()
   * @generated
   */
  EReference getBooleanExp_Right();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.aut.gergelyszaz.bGL.BooleanExp#getNestedExp <em>Nested Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Nested Exp</em>'.
   * @see hu.bme.aut.gergelyszaz.bGL.BooleanExp#getNestedExp()
   * @see #getBooleanExp()
   * @generated
   */
  EReference getBooleanExp_NestedExp();

  /**
   * Returns the meta object for class '{@link hu.bme.aut.gergelyszaz.bGL.AttributeName <em>Attribute Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute Name</em>'.
   * @see hu.bme.aut.gergelyszaz.bGL.AttributeName
   * @generated
   */
  EClass getAttributeName();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.aut.gergelyszaz.bGL.AttributeName#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see hu.bme.aut.gergelyszaz.bGL.AttributeName#getName()
   * @see #getAttributeName()
   * @generated
   */
  EAttribute getAttributeName_Name();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.aut.gergelyszaz.bGL.AttributeName#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Parent</em>'.
   * @see hu.bme.aut.gergelyszaz.bGL.AttributeName#getParent()
   * @see #getAttributeName()
   * @generated
   */
  EAttribute getAttributeName_Parent();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.aut.gergelyszaz.bGL.AttributeName#getChild <em>Child</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Child</em>'.
   * @see hu.bme.aut.gergelyszaz.bGL.AttributeName#getChild()
   * @see #getAttributeName()
   * @generated
   */
  EReference getAttributeName_Child();

  /**
   * Returns the meta object for class '{@link hu.bme.aut.gergelyszaz.bGL.AttributeOrInt <em>Attribute Or Int</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute Or Int</em>'.
   * @see hu.bme.aut.gergelyszaz.bGL.AttributeOrInt
   * @generated
   */
  EClass getAttributeOrInt();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.aut.gergelyszaz.bGL.AttributeOrInt#getAttribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attribute</em>'.
   * @see hu.bme.aut.gergelyszaz.bGL.AttributeOrInt#getAttribute()
   * @see #getAttributeOrInt()
   * @generated
   */
  EReference getAttributeOrInt_Attribute();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.aut.gergelyszaz.bGL.AttributeOrInt#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see hu.bme.aut.gergelyszaz.bGL.AttributeOrInt#getValue()
   * @see #getAttributeOrInt()
   * @generated
   */
  EAttribute getAttributeOrInt_Value();

  /**
   * Returns the meta object for class '{@link hu.bme.aut.gergelyszaz.bGL.AddtionExp <em>Addtion Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Addtion Exp</em>'.
   * @see hu.bme.aut.gergelyszaz.bGL.AddtionExp
   * @generated
   */
  EClass getAddtionExp();

  /**
   * Returns the meta object for class '{@link hu.bme.aut.gergelyszaz.bGL.MultiplicationExp <em>Multiplication Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multiplication Exp</em>'.
   * @see hu.bme.aut.gergelyszaz.bGL.MultiplicationExp
   * @generated
   */
  EClass getMultiplicationExp();

  /**
   * Returns the meta object for the containment reference list '{@link hu.bme.aut.gergelyszaz.bGL.MultiplicationExp#getExpressions <em>Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expressions</em>'.
   * @see hu.bme.aut.gergelyszaz.bGL.MultiplicationExp#getExpressions()
   * @see #getMultiplicationExp()
   * @generated
   */
  EReference getMultiplicationExp_Expressions();

  /**
   * Returns the meta object for the attribute list '{@link hu.bme.aut.gergelyszaz.bGL.MultiplicationExp#getOperators <em>Operators</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Operators</em>'.
   * @see hu.bme.aut.gergelyszaz.bGL.MultiplicationExp#getOperators()
   * @see #getMultiplicationExp()
   * @generated
   */
  EAttribute getMultiplicationExp_Operators();

  /**
   * Returns the meta object for class '{@link hu.bme.aut.gergelyszaz.bGL.ValueAssignment <em>Value Assignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Value Assignment</em>'.
   * @see hu.bme.aut.gergelyszaz.bGL.ValueAssignment
   * @generated
   */
  EClass getValueAssignment();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.aut.gergelyszaz.bGL.ValueAssignment#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see hu.bme.aut.gergelyszaz.bGL.ValueAssignment#getName()
   * @see #getValueAssignment()
   * @generated
   */
  EReference getValueAssignment_Name();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.aut.gergelyszaz.bGL.ValueAssignment#getAddition <em>Addition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Addition</em>'.
   * @see hu.bme.aut.gergelyszaz.bGL.ValueAssignment#getAddition()
   * @see #getValueAssignment()
   * @generated
   */
  EReference getValueAssignment_Addition();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  BGLFactory getBGLFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link hu.bme.aut.gergelyszaz.bGL.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.aut.gergelyszaz.bGL.impl.ModelImpl
     * @see hu.bme.aut.gergelyszaz.bGL.impl.BGLPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODEL__NAME = eINSTANCE.getModel_Name();

    /**
     * The meta object literal for the '<em><b>Player</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__PLAYER = eINSTANCE.getModel_Player();

    /**
     * The meta object literal for the '<em><b>Board</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__BOARD = eINSTANCE.getModel_Board();

    /**
     * The meta object literal for the '<em><b>Tokens</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__TOKENS = eINSTANCE.getModel_Tokens();

    /**
     * The meta object literal for the '<em><b>Rules</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__RULES = eINSTANCE.getModel_Rules();

    /**
     * The meta object literal for the '{@link hu.bme.aut.gergelyszaz.bGL.impl.PlayerImpl <em>Player</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.aut.gergelyszaz.bGL.impl.PlayerImpl
     * @see hu.bme.aut.gergelyszaz.bGL.impl.BGLPackageImpl#getPlayer()
     * @generated
     */
    EClass PLAYER = eINSTANCE.getPlayer();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PLAYER__NAME = eINSTANCE.getPlayer_Name();

    /**
     * The meta object literal for the '<em><b>Playercount</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PLAYER__PLAYERCOUNT = eINSTANCE.getPlayer_Playercount();

    /**
     * The meta object literal for the '{@link hu.bme.aut.gergelyszaz.bGL.impl.BoardImpl <em>Board</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.aut.gergelyszaz.bGL.impl.BoardImpl
     * @see hu.bme.aut.gergelyszaz.bGL.impl.BGLPackageImpl#getBoard()
     * @generated
     */
    EClass BOARD = eINSTANCE.getBoard();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOARD__NAME = eINSTANCE.getBoard_Name();

    /**
     * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BOARD__FIELDS = eINSTANCE.getBoard_Fields();

    /**
     * The meta object literal for the '{@link hu.bme.aut.gergelyszaz.bGL.impl.RulesImpl <em>Rules</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.aut.gergelyszaz.bGL.impl.RulesImpl
     * @see hu.bme.aut.gergelyszaz.bGL.impl.BGLPackageImpl#getRules()
     * @generated
     */
    EClass RULES = eINSTANCE.getRules();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RULES__NAME = eINSTANCE.getRules_Name();

    /**
     * The meta object literal for the '<em><b>Turnrules</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULES__TURNRULES = eINSTANCE.getRules_Turnrules();

    /**
     * The meta object literal for the '{@link hu.bme.aut.gergelyszaz.bGL.impl.TurnRulesImpl <em>Turn Rules</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.aut.gergelyszaz.bGL.impl.TurnRulesImpl
     * @see hu.bme.aut.gergelyszaz.bGL.impl.BGLPackageImpl#getTurnRules()
     * @generated
     */
    EClass TURN_RULES = eINSTANCE.getTurnRules();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TURN_RULES__NAME = eINSTANCE.getTurnRules_Name();

    /**
     * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TURN_RULES__ACTIONS = eINSTANCE.getTurnRules_Actions();

    /**
     * The meta object literal for the '{@link hu.bme.aut.gergelyszaz.bGL.impl.TokenImpl <em>Token</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.aut.gergelyszaz.bGL.impl.TokenImpl
     * @see hu.bme.aut.gergelyszaz.bGL.impl.BGLPackageImpl#getToken()
     * @generated
     */
    EClass TOKEN = eINSTANCE.getToken();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TOKEN__NAME = eINSTANCE.getToken_Name();

    /**
     * The meta object literal for the '{@link hu.bme.aut.gergelyszaz.bGL.impl.FieldImpl <em>Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.aut.gergelyszaz.bGL.impl.FieldImpl
     * @see hu.bme.aut.gergelyszaz.bGL.impl.BGLPackageImpl#getField()
     * @generated
     */
    EClass FIELD = eINSTANCE.getField();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD__NAME = eINSTANCE.getField_Name();

    /**
     * The meta object literal for the '<em><b>X</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD__X = eINSTANCE.getField_X();

    /**
     * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD__Y = eINSTANCE.getField_Y();

    /**
     * The meta object literal for the '<em><b>Z</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD__Z = eINSTANCE.getField_Z();

    /**
     * The meta object literal for the '<em><b>Neighbours</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELD__NEIGHBOURS = eINSTANCE.getField_Neighbours();

    /**
     * The meta object literal for the '{@link hu.bme.aut.gergelyszaz.bGL.impl.ActionImpl <em>Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.aut.gergelyszaz.bGL.impl.ActionImpl
     * @see hu.bme.aut.gergelyszaz.bGL.impl.BGLPackageImpl#getAction()
     * @generated
     */
    EClass ACTION = eINSTANCE.getAction();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION__NAME = eINSTANCE.getAction_Name();

    /**
     * The meta object literal for the '<em><b>Token</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION__TOKEN = eINSTANCE.getAction_Token();

    /**
     * The meta object literal for the '<em><b>Object Of Select</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION__OBJECT_OF_SELECT = eINSTANCE.getAction_ObjectOfSelect();

    /**
     * The meta object literal for the '<em><b>Filter</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION__FILTER = eINSTANCE.getAction_Filter();

    /**
     * The meta object literal for the '<em><b>Assignment</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION__ASSIGNMENT = eINSTANCE.getAction_Assignment();

    /**
     * The meta object literal for the '{@link hu.bme.aut.gergelyszaz.bGL.impl.OrExpImpl <em>Or Exp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.aut.gergelyszaz.bGL.impl.OrExpImpl
     * @see hu.bme.aut.gergelyszaz.bGL.impl.BGLPackageImpl#getOrExp()
     * @generated
     */
    EClass OR_EXP = eINSTANCE.getOrExp();

    /**
     * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OR_EXP__EXPRESSIONS = eINSTANCE.getOrExp_Expressions();

    /**
     * The meta object literal for the '<em><b>Operators</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OR_EXP__OPERATORS = eINSTANCE.getOrExp_Operators();

    /**
     * The meta object literal for the '{@link hu.bme.aut.gergelyszaz.bGL.impl.AndExpImpl <em>And Exp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.aut.gergelyszaz.bGL.impl.AndExpImpl
     * @see hu.bme.aut.gergelyszaz.bGL.impl.BGLPackageImpl#getAndExp()
     * @generated
     */
    EClass AND_EXP = eINSTANCE.getAndExp();

    /**
     * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AND_EXP__EXPRESSIONS = eINSTANCE.getAndExp_Expressions();

    /**
     * The meta object literal for the '<em><b>Operators</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AND_EXP__OPERATORS = eINSTANCE.getAndExp_Operators();

    /**
     * The meta object literal for the '{@link hu.bme.aut.gergelyszaz.bGL.impl.BooleanExpImpl <em>Boolean Exp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.aut.gergelyszaz.bGL.impl.BooleanExpImpl
     * @see hu.bme.aut.gergelyszaz.bGL.impl.BGLPackageImpl#getBooleanExp()
     * @generated
     */
    EClass BOOLEAN_EXP = eINSTANCE.getBooleanExp();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BOOLEAN_EXP__LEFT = eINSTANCE.getBooleanExp_Left();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOOLEAN_EXP__OPERATOR = eINSTANCE.getBooleanExp_Operator();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BOOLEAN_EXP__RIGHT = eINSTANCE.getBooleanExp_Right();

    /**
     * The meta object literal for the '<em><b>Nested Exp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BOOLEAN_EXP__NESTED_EXP = eINSTANCE.getBooleanExp_NestedExp();

    /**
     * The meta object literal for the '{@link hu.bme.aut.gergelyszaz.bGL.impl.AttributeNameImpl <em>Attribute Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.aut.gergelyszaz.bGL.impl.AttributeNameImpl
     * @see hu.bme.aut.gergelyszaz.bGL.impl.BGLPackageImpl#getAttributeName()
     * @generated
     */
    EClass ATTRIBUTE_NAME = eINSTANCE.getAttributeName();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE_NAME__NAME = eINSTANCE.getAttributeName_Name();

    /**
     * The meta object literal for the '<em><b>Parent</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE_NAME__PARENT = eINSTANCE.getAttributeName_Parent();

    /**
     * The meta object literal for the '<em><b>Child</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE_NAME__CHILD = eINSTANCE.getAttributeName_Child();

    /**
     * The meta object literal for the '{@link hu.bme.aut.gergelyszaz.bGL.impl.AttributeOrIntImpl <em>Attribute Or Int</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.aut.gergelyszaz.bGL.impl.AttributeOrIntImpl
     * @see hu.bme.aut.gergelyszaz.bGL.impl.BGLPackageImpl#getAttributeOrInt()
     * @generated
     */
    EClass ATTRIBUTE_OR_INT = eINSTANCE.getAttributeOrInt();

    /**
     * The meta object literal for the '<em><b>Attribute</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE_OR_INT__ATTRIBUTE = eINSTANCE.getAttributeOrInt_Attribute();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE_OR_INT__VALUE = eINSTANCE.getAttributeOrInt_Value();

    /**
     * The meta object literal for the '{@link hu.bme.aut.gergelyszaz.bGL.impl.AddtionExpImpl <em>Addtion Exp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.aut.gergelyszaz.bGL.impl.AddtionExpImpl
     * @see hu.bme.aut.gergelyszaz.bGL.impl.BGLPackageImpl#getAddtionExp()
     * @generated
     */
    EClass ADDTION_EXP = eINSTANCE.getAddtionExp();

    /**
     * The meta object literal for the '{@link hu.bme.aut.gergelyszaz.bGL.impl.MultiplicationExpImpl <em>Multiplication Exp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.aut.gergelyszaz.bGL.impl.MultiplicationExpImpl
     * @see hu.bme.aut.gergelyszaz.bGL.impl.BGLPackageImpl#getMultiplicationExp()
     * @generated
     */
    EClass MULTIPLICATION_EXP = eINSTANCE.getMultiplicationExp();

    /**
     * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTIPLICATION_EXP__EXPRESSIONS = eINSTANCE.getMultiplicationExp_Expressions();

    /**
     * The meta object literal for the '<em><b>Operators</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MULTIPLICATION_EXP__OPERATORS = eINSTANCE.getMultiplicationExp_Operators();

    /**
     * The meta object literal for the '{@link hu.bme.aut.gergelyszaz.bGL.impl.ValueAssignmentImpl <em>Value Assignment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.aut.gergelyszaz.bGL.impl.ValueAssignmentImpl
     * @see hu.bme.aut.gergelyszaz.bGL.impl.BGLPackageImpl#getValueAssignment()
     * @generated
     */
    EClass VALUE_ASSIGNMENT = eINSTANCE.getValueAssignment();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VALUE_ASSIGNMENT__NAME = eINSTANCE.getValueAssignment_Name();

    /**
     * The meta object literal for the '<em><b>Addition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VALUE_ASSIGNMENT__ADDITION = eINSTANCE.getValueAssignment_Addition();

  }

} //BGLPackage
