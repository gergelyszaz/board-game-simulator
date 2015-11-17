/**
 */
package hu.bme.aut.gergelyszaz.bGL.impl;

import hu.bme.aut.gergelyszaz.bGL.*;

import org.eclipse.emf.ecore.EClass;
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
public class BGLFactoryImpl extends EFactoryImpl implements BGLFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static BGLFactory init()
  {
    try
    {
      BGLFactory theBGLFactory = (BGLFactory)EPackage.Registry.INSTANCE.getEFactory(BGLPackage.eNS_URI);
      if (theBGLFactory != null)
      {
        return theBGLFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new BGLFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BGLFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case BGLPackage.MODEL: return createModel();
      case BGLPackage.PLAYER: return createPlayer();
      case BGLPackage.BOARD: return createBoard();
      case BGLPackage.RULES: return createRules();
      case BGLPackage.TURN_RULES: return createTurnRules();
      case BGLPackage.TOKEN: return createToken();
      case BGLPackage.FIELD: return createField();
      case BGLPackage.ACTION: return createAction();
      case BGLPackage.VARIABLE: return createVariable();
      case BGLPackage.REFERENCE: return createReference();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Player createPlayer()
  {
    PlayerImpl player = new PlayerImpl();
    return player;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Board createBoard()
  {
    BoardImpl board = new BoardImpl();
    return board;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Rules createRules()
  {
    RulesImpl rules = new RulesImpl();
    return rules;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TurnRules createTurnRules()
  {
    TurnRulesImpl turnRules = new TurnRulesImpl();
    return turnRules;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Token createToken()
  {
    TokenImpl token = new TokenImpl();
    return token;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Field createField()
  {
    FieldImpl field = new FieldImpl();
    return field;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Action createAction()
  {
    ActionImpl action = new ActionImpl();
    return action;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable createVariable()
  {
    VariableImpl variable = new VariableImpl();
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Reference createReference()
  {
    ReferenceImpl reference = new ReferenceImpl();
    return reference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BGLPackage getBGLPackage()
  {
    return (BGLPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static BGLPackage getPackage()
  {
    return BGLPackage.eINSTANCE;
  }

} //BGLFactoryImpl
