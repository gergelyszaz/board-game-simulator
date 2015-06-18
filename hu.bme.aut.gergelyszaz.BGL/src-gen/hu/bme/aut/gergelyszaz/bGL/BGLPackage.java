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
   * The feature id for the '<em><b>Tokens</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__TOKENS = 3;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 4;

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
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLAYER__ATTRIBUTES = 2;

  /**
   * The number of structural features of the '<em>Player</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLAYER_FEATURE_COUNT = 3;

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
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOARD__ATTRIBUTES = 2;

  /**
   * The number of structural features of the '<em>Board</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOARD_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link hu.bme.aut.gergelyszaz.bGL.impl.TokensImpl <em>Tokens</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.aut.gergelyszaz.bGL.impl.TokensImpl
   * @see hu.bme.aut.gergelyszaz.bGL.impl.BGLPackageImpl#getTokens()
   * @generated
   */
  int TOKENS = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOKENS__NAME = 0;

  /**
   * The feature id for the '<em><b>Tokentypes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOKENS__TOKENTYPES = 1;

  /**
   * The number of structural features of the '<em>Tokens</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOKENS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link hu.bme.aut.gergelyszaz.bGL.impl.TokenTypeImpl <em>Token Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.aut.gergelyszaz.bGL.impl.TokenTypeImpl
   * @see hu.bme.aut.gergelyszaz.bGL.impl.BGLPackageImpl#getTokenType()
   * @generated
   */
  int TOKEN_TYPE = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOKEN_TYPE__NAME = 0;

  /**
   * The feature id for the '<em><b>Variables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOKEN_TYPE__VARIABLES = 1;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOKEN_TYPE__ATTRIBUTES = 2;

  /**
   * The number of structural features of the '<em>Token Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOKEN_TYPE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link hu.bme.aut.gergelyszaz.bGL.impl.AttributeImpl <em>Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.aut.gergelyszaz.bGL.impl.AttributeImpl
   * @see hu.bme.aut.gergelyszaz.bGL.impl.BGLPackageImpl#getAttribute()
   * @generated
   */
  int ATTRIBUTE = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__NAME = 0;

  /**
   * The number of structural features of the '<em>Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_FEATURE_COUNT = 1;

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
   * The feature id for the '<em><b>Field</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__FIELD = 2;

  /**
   * The feature id for the '<em><b>From</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__FROM = 3;

  /**
   * The feature id for the '<em><b>To</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__TO = 4;

  /**
   * The number of structural features of the '<em>Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link hu.bme.aut.gergelyszaz.bGL.impl.VariableImpl <em>Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.aut.gergelyszaz.bGL.impl.VariableImpl
   * @see hu.bme.aut.gergelyszaz.bGL.impl.BGLPackageImpl#getVariable()
   * @generated
   */
  int VARIABLE = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__NAME = 0;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__EXPRESSION = 1;

  /**
   * The number of structural features of the '<em>Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link hu.bme.aut.gergelyszaz.bGL.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.aut.gergelyszaz.bGL.impl.ExpressionImpl
   * @see hu.bme.aut.gergelyszaz.bGL.impl.BGLPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 9;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link hu.bme.aut.gergelyszaz.bGL.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.aut.gergelyszaz.bGL.impl.TypeImpl
   * @see hu.bme.aut.gergelyszaz.bGL.impl.BGLPackageImpl#getType()
   * @generated
   */
  int TYPE = 10;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link hu.bme.aut.gergelyszaz.bGL.impl.AndOrExpressionImpl <em>And Or Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.aut.gergelyszaz.bGL.impl.AndOrExpressionImpl
   * @see hu.bme.aut.gergelyszaz.bGL.impl.BGLPackageImpl#getAndOrExpression()
   * @generated
   */
  int AND_OR_EXPRESSION = 11;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_OR_EXPRESSION__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_OR_EXPRESSION__OP = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_OR_EXPRESSION__RIGHT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>And Or Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_OR_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link hu.bme.aut.gergelyszaz.bGL.impl.ComparisonImpl <em>Comparison</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.aut.gergelyszaz.bGL.impl.ComparisonImpl
   * @see hu.bme.aut.gergelyszaz.bGL.impl.BGLPackageImpl#getComparison()
   * @generated
   */
  int COMPARISON = 12;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON__OP = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON__RIGHT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Comparison</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link hu.bme.aut.gergelyszaz.bGL.impl.EqualsImpl <em>Equals</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.aut.gergelyszaz.bGL.impl.EqualsImpl
   * @see hu.bme.aut.gergelyszaz.bGL.impl.BGLPackageImpl#getEquals()
   * @generated
   */
  int EQUALS = 13;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALS__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALS__OP = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALS__RIGHT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Equals</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link hu.bme.aut.gergelyszaz.bGL.impl.PlusImpl <em>Plus</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.aut.gergelyszaz.bGL.impl.PlusImpl
   * @see hu.bme.aut.gergelyszaz.bGL.impl.BGLPackageImpl#getPlus()
   * @generated
   */
  int PLUS = 14;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Plus</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link hu.bme.aut.gergelyszaz.bGL.impl.MinusImpl <em>Minus</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.aut.gergelyszaz.bGL.impl.MinusImpl
   * @see hu.bme.aut.gergelyszaz.bGL.impl.BGLPackageImpl#getMinus()
   * @generated
   */
  int MINUS = 15;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Minus</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link hu.bme.aut.gergelyszaz.bGL.impl.MultiOrDivImpl <em>Multi Or Div</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.aut.gergelyszaz.bGL.impl.MultiOrDivImpl
   * @see hu.bme.aut.gergelyszaz.bGL.impl.BGLPackageImpl#getMultiOrDiv()
   * @generated
   */
  int MULTI_OR_DIV = 16;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI_OR_DIV__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI_OR_DIV__OP = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI_OR_DIV__RIGHT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Multi Or Div</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI_OR_DIV_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link hu.bme.aut.gergelyszaz.bGL.impl.BooleanNegationImpl <em>Boolean Negation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.aut.gergelyszaz.bGL.impl.BooleanNegationImpl
   * @see hu.bme.aut.gergelyszaz.bGL.impl.BGLPackageImpl#getBooleanNegation()
   * @generated
   */
  int BOOLEAN_NEGATION = 17;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_NEGATION__EXPRESSION = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Boolean Negation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_NEGATION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hu.bme.aut.gergelyszaz.bGL.impl.ArithmeticSignedImpl <em>Arithmetic Signed</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.aut.gergelyszaz.bGL.impl.ArithmeticSignedImpl
   * @see hu.bme.aut.gergelyszaz.bGL.impl.BGLPackageImpl#getArithmeticSigned()
   * @generated
   */
  int ARITHMETIC_SIGNED = 18;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARITHMETIC_SIGNED__EXPRESSION = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Arithmetic Signed</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARITHMETIC_SIGNED_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hu.bme.aut.gergelyszaz.bGL.impl.NumberLiteralImpl <em>Number Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.aut.gergelyszaz.bGL.impl.NumberLiteralImpl
   * @see hu.bme.aut.gergelyszaz.bGL.impl.BGLPackageImpl#getNumberLiteral()
   * @generated
   */
  int NUMBER_LITERAL = 19;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_LITERAL__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Number Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hu.bme.aut.gergelyszaz.bGL.impl.StringLiteralImpl <em>String Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.aut.gergelyszaz.bGL.impl.StringLiteralImpl
   * @see hu.bme.aut.gergelyszaz.bGL.impl.BGLPackageImpl#getStringLiteral()
   * @generated
   */
  int STRING_LITERAL = 20;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>String Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hu.bme.aut.gergelyszaz.bGL.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.aut.gergelyszaz.bGL.impl.BooleanLiteralImpl
   * @see hu.bme.aut.gergelyszaz.bGL.impl.BGLPackageImpl#getBooleanLiteral()
   * @generated
   */
  int BOOLEAN_LITERAL = 21;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LITERAL__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Boolean Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hu.bme.aut.gergelyszaz.bGL.impl.VariableReferenceImpl <em>Variable Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.aut.gergelyszaz.bGL.impl.VariableReferenceImpl
   * @see hu.bme.aut.gergelyszaz.bGL.impl.BGLPackageImpl#getVariableReference()
   * @generated
   */
  int VARIABLE_REFERENCE = 22;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_REFERENCE__REF = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Variable Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_REFERENCE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hu.bme.aut.gergelyszaz.bGL.impl.IntTypeImpl <em>Int Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.aut.gergelyszaz.bGL.impl.IntTypeImpl
   * @see hu.bme.aut.gergelyszaz.bGL.impl.BGLPackageImpl#getIntType()
   * @generated
   */
  int INT_TYPE = 23;

  /**
   * The number of structural features of the '<em>Int Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link hu.bme.aut.gergelyszaz.bGL.impl.StringTypeImpl <em>String Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.aut.gergelyszaz.bGL.impl.StringTypeImpl
   * @see hu.bme.aut.gergelyszaz.bGL.impl.BGLPackageImpl#getStringType()
   * @generated
   */
  int STRING_TYPE = 24;

  /**
   * The number of structural features of the '<em>String Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link hu.bme.aut.gergelyszaz.bGL.impl.BooleanTypeImpl <em>Boolean Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.aut.gergelyszaz.bGL.impl.BooleanTypeImpl
   * @see hu.bme.aut.gergelyszaz.bGL.impl.BGLPackageImpl#getBooleanType()
   * @generated
   */
  int BOOLEAN_TYPE = 25;

  /**
   * The number of structural features of the '<em>Boolean Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;


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
   * Returns the meta object for the containment reference '{@link hu.bme.aut.gergelyszaz.bGL.Model#getTokens <em>Tokens</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tokens</em>'.
   * @see hu.bme.aut.gergelyszaz.bGL.Model#getTokens()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Tokens();

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
   * Returns the meta object for the containment reference list '{@link hu.bme.aut.gergelyszaz.bGL.Player#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see hu.bme.aut.gergelyszaz.bGL.Player#getAttributes()
   * @see #getPlayer()
   * @generated
   */
  EReference getPlayer_Attributes();

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
   * Returns the meta object for the containment reference list '{@link hu.bme.aut.gergelyszaz.bGL.Board#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see hu.bme.aut.gergelyszaz.bGL.Board#getAttributes()
   * @see #getBoard()
   * @generated
   */
  EReference getBoard_Attributes();

  /**
   * Returns the meta object for class '{@link hu.bme.aut.gergelyszaz.bGL.Tokens <em>Tokens</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tokens</em>'.
   * @see hu.bme.aut.gergelyszaz.bGL.Tokens
   * @generated
   */
  EClass getTokens();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.aut.gergelyszaz.bGL.Tokens#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see hu.bme.aut.gergelyszaz.bGL.Tokens#getName()
   * @see #getTokens()
   * @generated
   */
  EAttribute getTokens_Name();

  /**
   * Returns the meta object for the containment reference list '{@link hu.bme.aut.gergelyszaz.bGL.Tokens#getTokentypes <em>Tokentypes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Tokentypes</em>'.
   * @see hu.bme.aut.gergelyszaz.bGL.Tokens#getTokentypes()
   * @see #getTokens()
   * @generated
   */
  EReference getTokens_Tokentypes();

  /**
   * Returns the meta object for class '{@link hu.bme.aut.gergelyszaz.bGL.TokenType <em>Token Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Token Type</em>'.
   * @see hu.bme.aut.gergelyszaz.bGL.TokenType
   * @generated
   */
  EClass getTokenType();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.aut.gergelyszaz.bGL.TokenType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see hu.bme.aut.gergelyszaz.bGL.TokenType#getName()
   * @see #getTokenType()
   * @generated
   */
  EAttribute getTokenType_Name();

  /**
   * Returns the meta object for the containment reference list '{@link hu.bme.aut.gergelyszaz.bGL.TokenType#getVariables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variables</em>'.
   * @see hu.bme.aut.gergelyszaz.bGL.TokenType#getVariables()
   * @see #getTokenType()
   * @generated
   */
  EReference getTokenType_Variables();

  /**
   * Returns the meta object for the containment reference list '{@link hu.bme.aut.gergelyszaz.bGL.TokenType#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see hu.bme.aut.gergelyszaz.bGL.TokenType#getAttributes()
   * @see #getTokenType()
   * @generated
   */
  EReference getTokenType_Attributes();

  /**
   * Returns the meta object for class '{@link hu.bme.aut.gergelyszaz.bGL.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute</em>'.
   * @see hu.bme.aut.gergelyszaz.bGL.Attribute
   * @generated
   */
  EClass getAttribute();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.aut.gergelyszaz.bGL.Attribute#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see hu.bme.aut.gergelyszaz.bGL.Attribute#getName()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Name();

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
   * Returns the meta object for the reference '{@link hu.bme.aut.gergelyszaz.bGL.Action#getField <em>Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Field</em>'.
   * @see hu.bme.aut.gergelyszaz.bGL.Action#getField()
   * @see #getAction()
   * @generated
   */
  EReference getAction_Field();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.aut.gergelyszaz.bGL.Action#getFrom <em>From</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>From</em>'.
   * @see hu.bme.aut.gergelyszaz.bGL.Action#getFrom()
   * @see #getAction()
   * @generated
   */
  EAttribute getAction_From();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.aut.gergelyszaz.bGL.Action#getTo <em>To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>To</em>'.
   * @see hu.bme.aut.gergelyszaz.bGL.Action#getTo()
   * @see #getAction()
   * @generated
   */
  EAttribute getAction_To();

  /**
   * Returns the meta object for class '{@link hu.bme.aut.gergelyszaz.bGL.Variable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable</em>'.
   * @see hu.bme.aut.gergelyszaz.bGL.Variable
   * @generated
   */
  EClass getVariable();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.aut.gergelyszaz.bGL.Variable#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see hu.bme.aut.gergelyszaz.bGL.Variable#getName()
   * @see #getVariable()
   * @generated
   */
  EAttribute getVariable_Name();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.aut.gergelyszaz.bGL.Variable#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see hu.bme.aut.gergelyszaz.bGL.Variable#getExpression()
   * @see #getVariable()
   * @generated
   */
  EReference getVariable_Expression();

  /**
   * Returns the meta object for class '{@link hu.bme.aut.gergelyszaz.bGL.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see hu.bme.aut.gergelyszaz.bGL.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for class '{@link hu.bme.aut.gergelyszaz.bGL.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see hu.bme.aut.gergelyszaz.bGL.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for class '{@link hu.bme.aut.gergelyszaz.bGL.AndOrExpression <em>And Or Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>And Or Expression</em>'.
   * @see hu.bme.aut.gergelyszaz.bGL.AndOrExpression
   * @generated
   */
  EClass getAndOrExpression();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.aut.gergelyszaz.bGL.AndOrExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see hu.bme.aut.gergelyszaz.bGL.AndOrExpression#getLeft()
   * @see #getAndOrExpression()
   * @generated
   */
  EReference getAndOrExpression_Left();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.aut.gergelyszaz.bGL.AndOrExpression#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see hu.bme.aut.gergelyszaz.bGL.AndOrExpression#getOp()
   * @see #getAndOrExpression()
   * @generated
   */
  EAttribute getAndOrExpression_Op();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.aut.gergelyszaz.bGL.AndOrExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see hu.bme.aut.gergelyszaz.bGL.AndOrExpression#getRight()
   * @see #getAndOrExpression()
   * @generated
   */
  EReference getAndOrExpression_Right();

  /**
   * Returns the meta object for class '{@link hu.bme.aut.gergelyszaz.bGL.Comparison <em>Comparison</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Comparison</em>'.
   * @see hu.bme.aut.gergelyszaz.bGL.Comparison
   * @generated
   */
  EClass getComparison();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.aut.gergelyszaz.bGL.Comparison#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see hu.bme.aut.gergelyszaz.bGL.Comparison#getLeft()
   * @see #getComparison()
   * @generated
   */
  EReference getComparison_Left();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.aut.gergelyszaz.bGL.Comparison#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see hu.bme.aut.gergelyszaz.bGL.Comparison#getOp()
   * @see #getComparison()
   * @generated
   */
  EAttribute getComparison_Op();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.aut.gergelyszaz.bGL.Comparison#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see hu.bme.aut.gergelyszaz.bGL.Comparison#getRight()
   * @see #getComparison()
   * @generated
   */
  EReference getComparison_Right();

  /**
   * Returns the meta object for class '{@link hu.bme.aut.gergelyszaz.bGL.Equals <em>Equals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Equals</em>'.
   * @see hu.bme.aut.gergelyszaz.bGL.Equals
   * @generated
   */
  EClass getEquals();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.aut.gergelyszaz.bGL.Equals#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see hu.bme.aut.gergelyszaz.bGL.Equals#getLeft()
   * @see #getEquals()
   * @generated
   */
  EReference getEquals_Left();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.aut.gergelyszaz.bGL.Equals#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see hu.bme.aut.gergelyszaz.bGL.Equals#getOp()
   * @see #getEquals()
   * @generated
   */
  EAttribute getEquals_Op();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.aut.gergelyszaz.bGL.Equals#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see hu.bme.aut.gergelyszaz.bGL.Equals#getRight()
   * @see #getEquals()
   * @generated
   */
  EReference getEquals_Right();

  /**
   * Returns the meta object for class '{@link hu.bme.aut.gergelyszaz.bGL.Plus <em>Plus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Plus</em>'.
   * @see hu.bme.aut.gergelyszaz.bGL.Plus
   * @generated
   */
  EClass getPlus();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.aut.gergelyszaz.bGL.Plus#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see hu.bme.aut.gergelyszaz.bGL.Plus#getLeft()
   * @see #getPlus()
   * @generated
   */
  EReference getPlus_Left();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.aut.gergelyszaz.bGL.Plus#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see hu.bme.aut.gergelyszaz.bGL.Plus#getRight()
   * @see #getPlus()
   * @generated
   */
  EReference getPlus_Right();

  /**
   * Returns the meta object for class '{@link hu.bme.aut.gergelyszaz.bGL.Minus <em>Minus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Minus</em>'.
   * @see hu.bme.aut.gergelyszaz.bGL.Minus
   * @generated
   */
  EClass getMinus();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.aut.gergelyszaz.bGL.Minus#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see hu.bme.aut.gergelyszaz.bGL.Minus#getLeft()
   * @see #getMinus()
   * @generated
   */
  EReference getMinus_Left();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.aut.gergelyszaz.bGL.Minus#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see hu.bme.aut.gergelyszaz.bGL.Minus#getRight()
   * @see #getMinus()
   * @generated
   */
  EReference getMinus_Right();

  /**
   * Returns the meta object for class '{@link hu.bme.aut.gergelyszaz.bGL.MultiOrDiv <em>Multi Or Div</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multi Or Div</em>'.
   * @see hu.bme.aut.gergelyszaz.bGL.MultiOrDiv
   * @generated
   */
  EClass getMultiOrDiv();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.aut.gergelyszaz.bGL.MultiOrDiv#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see hu.bme.aut.gergelyszaz.bGL.MultiOrDiv#getLeft()
   * @see #getMultiOrDiv()
   * @generated
   */
  EReference getMultiOrDiv_Left();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.aut.gergelyszaz.bGL.MultiOrDiv#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see hu.bme.aut.gergelyszaz.bGL.MultiOrDiv#getOp()
   * @see #getMultiOrDiv()
   * @generated
   */
  EAttribute getMultiOrDiv_Op();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.aut.gergelyszaz.bGL.MultiOrDiv#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see hu.bme.aut.gergelyszaz.bGL.MultiOrDiv#getRight()
   * @see #getMultiOrDiv()
   * @generated
   */
  EReference getMultiOrDiv_Right();

  /**
   * Returns the meta object for class '{@link hu.bme.aut.gergelyszaz.bGL.BooleanNegation <em>Boolean Negation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Negation</em>'.
   * @see hu.bme.aut.gergelyszaz.bGL.BooleanNegation
   * @generated
   */
  EClass getBooleanNegation();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.aut.gergelyszaz.bGL.BooleanNegation#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see hu.bme.aut.gergelyszaz.bGL.BooleanNegation#getExpression()
   * @see #getBooleanNegation()
   * @generated
   */
  EReference getBooleanNegation_Expression();

  /**
   * Returns the meta object for class '{@link hu.bme.aut.gergelyszaz.bGL.ArithmeticSigned <em>Arithmetic Signed</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Arithmetic Signed</em>'.
   * @see hu.bme.aut.gergelyszaz.bGL.ArithmeticSigned
   * @generated
   */
  EClass getArithmeticSigned();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.aut.gergelyszaz.bGL.ArithmeticSigned#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see hu.bme.aut.gergelyszaz.bGL.ArithmeticSigned#getExpression()
   * @see #getArithmeticSigned()
   * @generated
   */
  EReference getArithmeticSigned_Expression();

  /**
   * Returns the meta object for class '{@link hu.bme.aut.gergelyszaz.bGL.NumberLiteral <em>Number Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Number Literal</em>'.
   * @see hu.bme.aut.gergelyszaz.bGL.NumberLiteral
   * @generated
   */
  EClass getNumberLiteral();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.aut.gergelyszaz.bGL.NumberLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see hu.bme.aut.gergelyszaz.bGL.NumberLiteral#getValue()
   * @see #getNumberLiteral()
   * @generated
   */
  EAttribute getNumberLiteral_Value();

  /**
   * Returns the meta object for class '{@link hu.bme.aut.gergelyszaz.bGL.StringLiteral <em>String Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Literal</em>'.
   * @see hu.bme.aut.gergelyszaz.bGL.StringLiteral
   * @generated
   */
  EClass getStringLiteral();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.aut.gergelyszaz.bGL.StringLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see hu.bme.aut.gergelyszaz.bGL.StringLiteral#getValue()
   * @see #getStringLiteral()
   * @generated
   */
  EAttribute getStringLiteral_Value();

  /**
   * Returns the meta object for class '{@link hu.bme.aut.gergelyszaz.bGL.BooleanLiteral <em>Boolean Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Literal</em>'.
   * @see hu.bme.aut.gergelyszaz.bGL.BooleanLiteral
   * @generated
   */
  EClass getBooleanLiteral();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.aut.gergelyszaz.bGL.BooleanLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see hu.bme.aut.gergelyszaz.bGL.BooleanLiteral#getValue()
   * @see #getBooleanLiteral()
   * @generated
   */
  EAttribute getBooleanLiteral_Value();

  /**
   * Returns the meta object for class '{@link hu.bme.aut.gergelyszaz.bGL.VariableReference <em>Variable Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Reference</em>'.
   * @see hu.bme.aut.gergelyszaz.bGL.VariableReference
   * @generated
   */
  EClass getVariableReference();

  /**
   * Returns the meta object for the reference '{@link hu.bme.aut.gergelyszaz.bGL.VariableReference#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref</em>'.
   * @see hu.bme.aut.gergelyszaz.bGL.VariableReference#getRef()
   * @see #getVariableReference()
   * @generated
   */
  EReference getVariableReference_Ref();

  /**
   * Returns the meta object for class '{@link hu.bme.aut.gergelyszaz.bGL.IntType <em>Int Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Int Type</em>'.
   * @see hu.bme.aut.gergelyszaz.bGL.IntType
   * @generated
   */
  EClass getIntType();

  /**
   * Returns the meta object for class '{@link hu.bme.aut.gergelyszaz.bGL.StringType <em>String Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Type</em>'.
   * @see hu.bme.aut.gergelyszaz.bGL.StringType
   * @generated
   */
  EClass getStringType();

  /**
   * Returns the meta object for class '{@link hu.bme.aut.gergelyszaz.bGL.BooleanType <em>Boolean Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Type</em>'.
   * @see hu.bme.aut.gergelyszaz.bGL.BooleanType
   * @generated
   */
  EClass getBooleanType();

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
     * The meta object literal for the '<em><b>Tokens</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__TOKENS = eINSTANCE.getModel_Tokens();

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
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLAYER__ATTRIBUTES = eINSTANCE.getPlayer_Attributes();

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
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BOARD__ATTRIBUTES = eINSTANCE.getBoard_Attributes();

    /**
     * The meta object literal for the '{@link hu.bme.aut.gergelyszaz.bGL.impl.TokensImpl <em>Tokens</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.aut.gergelyszaz.bGL.impl.TokensImpl
     * @see hu.bme.aut.gergelyszaz.bGL.impl.BGLPackageImpl#getTokens()
     * @generated
     */
    EClass TOKENS = eINSTANCE.getTokens();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TOKENS__NAME = eINSTANCE.getTokens_Name();

    /**
     * The meta object literal for the '<em><b>Tokentypes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TOKENS__TOKENTYPES = eINSTANCE.getTokens_Tokentypes();

    /**
     * The meta object literal for the '{@link hu.bme.aut.gergelyszaz.bGL.impl.TokenTypeImpl <em>Token Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.aut.gergelyszaz.bGL.impl.TokenTypeImpl
     * @see hu.bme.aut.gergelyszaz.bGL.impl.BGLPackageImpl#getTokenType()
     * @generated
     */
    EClass TOKEN_TYPE = eINSTANCE.getTokenType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TOKEN_TYPE__NAME = eINSTANCE.getTokenType_Name();

    /**
     * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TOKEN_TYPE__VARIABLES = eINSTANCE.getTokenType_Variables();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TOKEN_TYPE__ATTRIBUTES = eINSTANCE.getTokenType_Attributes();

    /**
     * The meta object literal for the '{@link hu.bme.aut.gergelyszaz.bGL.impl.AttributeImpl <em>Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.aut.gergelyszaz.bGL.impl.AttributeImpl
     * @see hu.bme.aut.gergelyszaz.bGL.impl.BGLPackageImpl#getAttribute()
     * @generated
     */
    EClass ATTRIBUTE = eINSTANCE.getAttribute();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

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
     * The meta object literal for the '<em><b>Field</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION__FIELD = eINSTANCE.getAction_Field();

    /**
     * The meta object literal for the '<em><b>From</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION__FROM = eINSTANCE.getAction_From();

    /**
     * The meta object literal for the '<em><b>To</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION__TO = eINSTANCE.getAction_To();

    /**
     * The meta object literal for the '{@link hu.bme.aut.gergelyszaz.bGL.impl.VariableImpl <em>Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.aut.gergelyszaz.bGL.impl.VariableImpl
     * @see hu.bme.aut.gergelyszaz.bGL.impl.BGLPackageImpl#getVariable()
     * @generated
     */
    EClass VARIABLE = eINSTANCE.getVariable();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE__EXPRESSION = eINSTANCE.getVariable_Expression();

    /**
     * The meta object literal for the '{@link hu.bme.aut.gergelyszaz.bGL.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.aut.gergelyszaz.bGL.impl.ExpressionImpl
     * @see hu.bme.aut.gergelyszaz.bGL.impl.BGLPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '{@link hu.bme.aut.gergelyszaz.bGL.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.aut.gergelyszaz.bGL.impl.TypeImpl
     * @see hu.bme.aut.gergelyszaz.bGL.impl.BGLPackageImpl#getType()
     * @generated
     */
    EClass TYPE = eINSTANCE.getType();

    /**
     * The meta object literal for the '{@link hu.bme.aut.gergelyszaz.bGL.impl.AndOrExpressionImpl <em>And Or Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.aut.gergelyszaz.bGL.impl.AndOrExpressionImpl
     * @see hu.bme.aut.gergelyszaz.bGL.impl.BGLPackageImpl#getAndOrExpression()
     * @generated
     */
    EClass AND_OR_EXPRESSION = eINSTANCE.getAndOrExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AND_OR_EXPRESSION__LEFT = eINSTANCE.getAndOrExpression_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AND_OR_EXPRESSION__OP = eINSTANCE.getAndOrExpression_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AND_OR_EXPRESSION__RIGHT = eINSTANCE.getAndOrExpression_Right();

    /**
     * The meta object literal for the '{@link hu.bme.aut.gergelyszaz.bGL.impl.ComparisonImpl <em>Comparison</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.aut.gergelyszaz.bGL.impl.ComparisonImpl
     * @see hu.bme.aut.gergelyszaz.bGL.impl.BGLPackageImpl#getComparison()
     * @generated
     */
    EClass COMPARISON = eINSTANCE.getComparison();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPARISON__LEFT = eINSTANCE.getComparison_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPARISON__OP = eINSTANCE.getComparison_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPARISON__RIGHT = eINSTANCE.getComparison_Right();

    /**
     * The meta object literal for the '{@link hu.bme.aut.gergelyszaz.bGL.impl.EqualsImpl <em>Equals</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.aut.gergelyszaz.bGL.impl.EqualsImpl
     * @see hu.bme.aut.gergelyszaz.bGL.impl.BGLPackageImpl#getEquals()
     * @generated
     */
    EClass EQUALS = eINSTANCE.getEquals();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EQUALS__LEFT = eINSTANCE.getEquals_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EQUALS__OP = eINSTANCE.getEquals_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EQUALS__RIGHT = eINSTANCE.getEquals_Right();

    /**
     * The meta object literal for the '{@link hu.bme.aut.gergelyszaz.bGL.impl.PlusImpl <em>Plus</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.aut.gergelyszaz.bGL.impl.PlusImpl
     * @see hu.bme.aut.gergelyszaz.bGL.impl.BGLPackageImpl#getPlus()
     * @generated
     */
    EClass PLUS = eINSTANCE.getPlus();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLUS__LEFT = eINSTANCE.getPlus_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLUS__RIGHT = eINSTANCE.getPlus_Right();

    /**
     * The meta object literal for the '{@link hu.bme.aut.gergelyszaz.bGL.impl.MinusImpl <em>Minus</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.aut.gergelyszaz.bGL.impl.MinusImpl
     * @see hu.bme.aut.gergelyszaz.bGL.impl.BGLPackageImpl#getMinus()
     * @generated
     */
    EClass MINUS = eINSTANCE.getMinus();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MINUS__LEFT = eINSTANCE.getMinus_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MINUS__RIGHT = eINSTANCE.getMinus_Right();

    /**
     * The meta object literal for the '{@link hu.bme.aut.gergelyszaz.bGL.impl.MultiOrDivImpl <em>Multi Or Div</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.aut.gergelyszaz.bGL.impl.MultiOrDivImpl
     * @see hu.bme.aut.gergelyszaz.bGL.impl.BGLPackageImpl#getMultiOrDiv()
     * @generated
     */
    EClass MULTI_OR_DIV = eINSTANCE.getMultiOrDiv();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTI_OR_DIV__LEFT = eINSTANCE.getMultiOrDiv_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MULTI_OR_DIV__OP = eINSTANCE.getMultiOrDiv_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTI_OR_DIV__RIGHT = eINSTANCE.getMultiOrDiv_Right();

    /**
     * The meta object literal for the '{@link hu.bme.aut.gergelyszaz.bGL.impl.BooleanNegationImpl <em>Boolean Negation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.aut.gergelyszaz.bGL.impl.BooleanNegationImpl
     * @see hu.bme.aut.gergelyszaz.bGL.impl.BGLPackageImpl#getBooleanNegation()
     * @generated
     */
    EClass BOOLEAN_NEGATION = eINSTANCE.getBooleanNegation();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BOOLEAN_NEGATION__EXPRESSION = eINSTANCE.getBooleanNegation_Expression();

    /**
     * The meta object literal for the '{@link hu.bme.aut.gergelyszaz.bGL.impl.ArithmeticSignedImpl <em>Arithmetic Signed</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.aut.gergelyszaz.bGL.impl.ArithmeticSignedImpl
     * @see hu.bme.aut.gergelyszaz.bGL.impl.BGLPackageImpl#getArithmeticSigned()
     * @generated
     */
    EClass ARITHMETIC_SIGNED = eINSTANCE.getArithmeticSigned();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARITHMETIC_SIGNED__EXPRESSION = eINSTANCE.getArithmeticSigned_Expression();

    /**
     * The meta object literal for the '{@link hu.bme.aut.gergelyszaz.bGL.impl.NumberLiteralImpl <em>Number Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.aut.gergelyszaz.bGL.impl.NumberLiteralImpl
     * @see hu.bme.aut.gergelyszaz.bGL.impl.BGLPackageImpl#getNumberLiteral()
     * @generated
     */
    EClass NUMBER_LITERAL = eINSTANCE.getNumberLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NUMBER_LITERAL__VALUE = eINSTANCE.getNumberLiteral_Value();

    /**
     * The meta object literal for the '{@link hu.bme.aut.gergelyszaz.bGL.impl.StringLiteralImpl <em>String Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.aut.gergelyszaz.bGL.impl.StringLiteralImpl
     * @see hu.bme.aut.gergelyszaz.bGL.impl.BGLPackageImpl#getStringLiteral()
     * @generated
     */
    EClass STRING_LITERAL = eINSTANCE.getStringLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_LITERAL__VALUE = eINSTANCE.getStringLiteral_Value();

    /**
     * The meta object literal for the '{@link hu.bme.aut.gergelyszaz.bGL.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.aut.gergelyszaz.bGL.impl.BooleanLiteralImpl
     * @see hu.bme.aut.gergelyszaz.bGL.impl.BGLPackageImpl#getBooleanLiteral()
     * @generated
     */
    EClass BOOLEAN_LITERAL = eINSTANCE.getBooleanLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOOLEAN_LITERAL__VALUE = eINSTANCE.getBooleanLiteral_Value();

    /**
     * The meta object literal for the '{@link hu.bme.aut.gergelyszaz.bGL.impl.VariableReferenceImpl <em>Variable Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.aut.gergelyszaz.bGL.impl.VariableReferenceImpl
     * @see hu.bme.aut.gergelyszaz.bGL.impl.BGLPackageImpl#getVariableReference()
     * @generated
     */
    EClass VARIABLE_REFERENCE = eINSTANCE.getVariableReference();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_REFERENCE__REF = eINSTANCE.getVariableReference_Ref();

    /**
     * The meta object literal for the '{@link hu.bme.aut.gergelyszaz.bGL.impl.IntTypeImpl <em>Int Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.aut.gergelyszaz.bGL.impl.IntTypeImpl
     * @see hu.bme.aut.gergelyszaz.bGL.impl.BGLPackageImpl#getIntType()
     * @generated
     */
    EClass INT_TYPE = eINSTANCE.getIntType();

    /**
     * The meta object literal for the '{@link hu.bme.aut.gergelyszaz.bGL.impl.StringTypeImpl <em>String Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.aut.gergelyszaz.bGL.impl.StringTypeImpl
     * @see hu.bme.aut.gergelyszaz.bGL.impl.BGLPackageImpl#getStringType()
     * @generated
     */
    EClass STRING_TYPE = eINSTANCE.getStringType();

    /**
     * The meta object literal for the '{@link hu.bme.aut.gergelyszaz.bGL.impl.BooleanTypeImpl <em>Boolean Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.aut.gergelyszaz.bGL.impl.BooleanTypeImpl
     * @see hu.bme.aut.gergelyszaz.bGL.impl.BGLPackageImpl#getBooleanType()
     * @generated
     */
    EClass BOOLEAN_TYPE = eINSTANCE.getBooleanType();

  }

} //BGLPackage
