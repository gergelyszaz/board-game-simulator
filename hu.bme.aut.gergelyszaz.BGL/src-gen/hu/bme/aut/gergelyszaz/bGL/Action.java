/**
 */
package hu.bme.aut.gergelyszaz.bGL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.aut.gergelyszaz.bGL.Action#getName <em>Name</em>}</li>
 *   <li>{@link hu.bme.aut.gergelyszaz.bGL.Action#getToken <em>Token</em>}</li>
 *   <li>{@link hu.bme.aut.gergelyszaz.bGL.Action#getField <em>Field</em>}</li>
 *   <li>{@link hu.bme.aut.gergelyszaz.bGL.Action#getFrom <em>From</em>}</li>
 *   <li>{@link hu.bme.aut.gergelyszaz.bGL.Action#getTo <em>To</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.aut.gergelyszaz.bGL.BGLPackage#getAction()
 * @model
 * @generated
 */
public interface Action extends EObject
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
   * @see hu.bme.aut.gergelyszaz.bGL.BGLPackage#getAction_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link hu.bme.aut.gergelyszaz.bGL.Action#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Token</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Token</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Token</em>' reference.
   * @see #setToken(TokenType)
   * @see hu.bme.aut.gergelyszaz.bGL.BGLPackage#getAction_Token()
   * @model
   * @generated
   */
  TokenType getToken();

  /**
   * Sets the value of the '{@link hu.bme.aut.gergelyszaz.bGL.Action#getToken <em>Token</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Token</em>' reference.
   * @see #getToken()
   * @generated
   */
  void setToken(TokenType value);

  /**
   * Returns the value of the '<em><b>Field</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Field</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Field</em>' reference.
   * @see #setField(Field)
   * @see hu.bme.aut.gergelyszaz.bGL.BGLPackage#getAction_Field()
   * @model
   * @generated
   */
  Field getField();

  /**
   * Sets the value of the '{@link hu.bme.aut.gergelyszaz.bGL.Action#getField <em>Field</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Field</em>' reference.
   * @see #getField()
   * @generated
   */
  void setField(Field value);

  /**
   * Returns the value of the '<em><b>From</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>From</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>From</em>' attribute.
   * @see #setFrom(int)
   * @see hu.bme.aut.gergelyszaz.bGL.BGLPackage#getAction_From()
   * @model
   * @generated
   */
  int getFrom();

  /**
   * Sets the value of the '{@link hu.bme.aut.gergelyszaz.bGL.Action#getFrom <em>From</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>From</em>' attribute.
   * @see #getFrom()
   * @generated
   */
  void setFrom(int value);

  /**
   * Returns the value of the '<em><b>To</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>To</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>To</em>' attribute.
   * @see #setTo(int)
   * @see hu.bme.aut.gergelyszaz.bGL.BGLPackage#getAction_To()
   * @model
   * @generated
   */
  int getTo();

  /**
   * Sets the value of the '{@link hu.bme.aut.gergelyszaz.bGL.Action#getTo <em>To</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>To</em>' attribute.
   * @see #getTo()
   * @generated
   */
  void setTo(int value);

} // Action
