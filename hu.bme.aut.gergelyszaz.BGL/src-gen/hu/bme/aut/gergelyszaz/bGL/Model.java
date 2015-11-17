/**
 */
package hu.bme.aut.gergelyszaz.bGL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.aut.gergelyszaz.bGL.Model#getName <em>Name</em>}</li>
 *   <li>{@link hu.bme.aut.gergelyszaz.bGL.Model#getPlayer <em>Player</em>}</li>
 *   <li>{@link hu.bme.aut.gergelyszaz.bGL.Model#getBoard <em>Board</em>}</li>
 *   <li>{@link hu.bme.aut.gergelyszaz.bGL.Model#getTokens <em>Tokens</em>}</li>
 *   <li>{@link hu.bme.aut.gergelyszaz.bGL.Model#getRules <em>Rules</em>}</li>
 * </ul>
 *
 * @see hu.bme.aut.gergelyszaz.bGL.BGLPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see hu.bme.aut.gergelyszaz.bGL.BGLPackage#getModel_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link hu.bme.aut.gergelyszaz.bGL.Model#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Player</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Player</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Player</em>' containment reference.
   * @see #setPlayer(Player)
   * @see hu.bme.aut.gergelyszaz.bGL.BGLPackage#getModel_Player()
   * @model containment="true"
   * @generated
   */
  Player getPlayer();

  /**
   * Sets the value of the '{@link hu.bme.aut.gergelyszaz.bGL.Model#getPlayer <em>Player</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Player</em>' containment reference.
   * @see #getPlayer()
   * @generated
   */
  void setPlayer(Player value);

  /**
   * Returns the value of the '<em><b>Board</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Board</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Board</em>' containment reference.
   * @see #setBoard(Board)
   * @see hu.bme.aut.gergelyszaz.bGL.BGLPackage#getModel_Board()
   * @model containment="true"
   * @generated
   */
  Board getBoard();

  /**
   * Sets the value of the '{@link hu.bme.aut.gergelyszaz.bGL.Model#getBoard <em>Board</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Board</em>' containment reference.
   * @see #getBoard()
   * @generated
   */
  void setBoard(Board value);

  /**
   * Returns the value of the '<em><b>Tokens</b></em>' containment reference list.
   * The list contents are of type {@link hu.bme.aut.gergelyszaz.bGL.Token}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tokens</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tokens</em>' containment reference list.
   * @see hu.bme.aut.gergelyszaz.bGL.BGLPackage#getModel_Tokens()
   * @model containment="true"
   * @generated
   */
  EList<Token> getTokens();

  /**
   * Returns the value of the '<em><b>Rules</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rules</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rules</em>' containment reference.
   * @see #setRules(Rules)
   * @see hu.bme.aut.gergelyszaz.bGL.BGLPackage#getModel_Rules()
   * @model containment="true"
   * @generated
   */
  Rules getRules();

  /**
   * Sets the value of the '{@link hu.bme.aut.gergelyszaz.bGL.Model#getRules <em>Rules</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rules</em>' containment reference.
   * @see #getRules()
   * @generated
   */
  void setRules(Rules value);

} // Model
