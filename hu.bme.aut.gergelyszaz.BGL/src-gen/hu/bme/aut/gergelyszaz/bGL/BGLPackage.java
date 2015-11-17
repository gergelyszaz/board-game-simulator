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
   * The feature id for the '<em><b>Variables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__VARIABLES = 5;

  /**
   * The number of structural features of the '<em>Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_FEATURE_COUNT = 6;

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
   * The number of structural features of the '<em>Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_FEATURE_COUNT = 3;

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
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__VALUE = 1;

  /**
   * The number of structural features of the '<em>Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link hu.bme.aut.gergelyszaz.bGL.impl.ReferenceImpl <em>Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.aut.gergelyszaz.bGL.impl.ReferenceImpl
   * @see hu.bme.aut.gergelyszaz.bGL.impl.BGLPackageImpl#getReference()
   * @generated
   */
  int REFERENCE = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE__NAME = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE__VALUE = 1;

  /**
   * The number of structural features of the '<em>Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_FEATURE_COUNT = 2;


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
   * Returns the meta object for the containment reference list '{@link hu.bme.aut.gergelyszaz.bGL.Field#getVariables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variables</em>'.
   * @see hu.bme.aut.gergelyszaz.bGL.Field#getVariables()
   * @see #getField()
   * @generated
   */
  EReference getField_Variables();

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
   * Returns the meta object for the attribute '{@link hu.bme.aut.gergelyszaz.bGL.Variable#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see hu.bme.aut.gergelyszaz.bGL.Variable#getValue()
   * @see #getVariable()
   * @generated
   */
  EAttribute getVariable_Value();

  /**
   * Returns the meta object for class '{@link hu.bme.aut.gergelyszaz.bGL.Reference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reference</em>'.
   * @see hu.bme.aut.gergelyszaz.bGL.Reference
   * @generated
   */
  EClass getReference();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.aut.gergelyszaz.bGL.Reference#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see hu.bme.aut.gergelyszaz.bGL.Reference#getName()
   * @see #getReference()
   * @generated
   */
  EAttribute getReference_Name();

  /**
   * Returns the meta object for the reference '{@link hu.bme.aut.gergelyszaz.bGL.Reference#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Value</em>'.
   * @see hu.bme.aut.gergelyszaz.bGL.Reference#getValue()
   * @see #getReference()
   * @generated
   */
  EReference getReference_Value();

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
     * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELD__VARIABLES = eINSTANCE.getField_Variables();

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
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE__VALUE = eINSTANCE.getVariable_Value();

    /**
     * The meta object literal for the '{@link hu.bme.aut.gergelyszaz.bGL.impl.ReferenceImpl <em>Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.aut.gergelyszaz.bGL.impl.ReferenceImpl
     * @see hu.bme.aut.gergelyszaz.bGL.impl.BGLPackageImpl#getReference()
     * @generated
     */
    EClass REFERENCE = eINSTANCE.getReference();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REFERENCE__NAME = eINSTANCE.getReference_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REFERENCE__VALUE = eINSTANCE.getReference_Value();

  }

} //BGLPackage
